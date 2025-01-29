<!-- <script setup lang="ts">
import { ref } from 'vue';
import type { CalculatorState } from '../calculatorlogic.ts';
import { createCalculatorState, handleInput } from '../calculatorlogic.ts';

const state = ref<CalculatorState>(createCalculatorState());

function onButtonClick(input: string) {
  handleInput(state.value, input);
  historyUpdate();
}

function historyUpdate() {
    const historyElement = document.querySelector(".history");
    if (historyElement) {
        historyElement.innerHTML = "";
        state.value.history.forEach((item) => {
            var p = document.createElement("p");
            p.innerHTML = item;
            historyElement.appendChild(p);
        });
    }
}

</script> -->

<script setup lang="ts">
import { ref } from 'vue';
import * as calculator from '../calculatorLogic';

const state = ref(calculator.createCalculatorState());

function historyUpdate() {
  const historyElement = document.querySelector('.history');
  if (historyElement) {
    historyElement.innerHTML = '';
    state.value.history.forEach((item) => {
      const p = document.createElement('p');
      p.innerHTML = item;
      historyElement.appendChild(p);
    });
  }
}

function onButtonClick(input: string) {
  calculator.handleInput(state.value, input);
  historyUpdate();
}
</script>




<template>
  <div class="calculator">
    <h3 style="width: 100%; text-align: left;">Calculator</h3>
    <div class="output">
      <div class="result">{{ state.result }}</div>
    </div>
    <div class="keys">
      <p @click="onButtonClick('1')">1</p>
      <p @click="onButtonClick('2')">2</p>
      <p @click="onButtonClick('3')">3</p>
      <p @click="onButtonClick('+')">+</p>
      <p @click="onButtonClick('4')">4</p>
      <p @click="onButtonClick('5')">5</p>
      <p @click="onButtonClick('6')">6</p>
      <p @click="onButtonClick('-')">-</p>
      <p @click="onButtonClick('7')">7</p>
      <p @click="onButtonClick('8')">8</p>
      <p @click="onButtonClick('9')">9</p>
      <p @click="onButtonClick('*')">*</p>
      <p @click="onButtonClick('0')">0</p>
      <p @click="onButtonClick('=')">=</p>
      <p @click="onButtonClick('C')">C</p>
      <p @click="onButtonClick('/')">/</p>
    </div>
    <div class="history">
    </div>
  </div>
</template>

<style scoped>
.calculator {
  width: var(--card-width);
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #f0f0f0;
  border-radius: 15px;
  text-align: center;
  background: rgb(59,70,100);
  color: white;
}
.result{
  display: block;
  text-align: right;
  font-size: 20px;
  margin: 0 auto;
  width: 100%;
  height: 50px;
  background-color: #ffffff;
  border: 2px solid #ebebeb;
  color: black;
  margin-bottom: 5px;
  text-align: center;
  line-height: 50px;
  font-size: 20px;
  cursor: pointer;
  opacity: 0.9;
  border-radius: 3px;
  box-shadow: 0 0 5px rgba(0,0,0,1);
}
.keys {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  background: rgb(37,45,68);
  color: black;
  border-radius: 15px;
  padding: 10px;
}
.keys > p {
  display: inline-block;
  width: 70px;
  height: 50px;
  background-color: #ffffff;
  border: 2px solid #ebebeb;
  margin: 5px;
  text-align: center;
  line-height: 50px;
  font-size: 20px;
  cursor: pointer;
  opacity: 0.9;
  border-radius: 3px;
  box-shadow: 0 0 5px rgba(0,0,0,1);
  /* background-image: linear-gradient(120deg, #ffffff 0%, #cccccc 100%); */
}
.keys > p:hover {
  opacity: 1;
  font-weight: bolder;
  border: 1px solid black;
}
.history > p {
    margin: 0;
    padding: 0;
    font-size: 12px;
    width: 100%;
}
</style>
