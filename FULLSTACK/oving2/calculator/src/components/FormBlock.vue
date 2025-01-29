<template>
  <div class="form">
    <form @submit.prevent="submitForm" class="formblock">
      <div>
        <h2>Contact Me:</h2>
      </div>
      <div>
        <label for="name">Name:</label>
        <input type="text" id="name" v-model="name" placeholder="Value"/>
      </div>
      <div>
        <label for="email">Email:</label>
        <input type="email" id="email" v-model="email" placeholder="Value" />
      </div>
      <div>
        <label for="message">Message:</label>
        <textarea id="message" v-model="message" placeholder="Value"></textarea>
      </div>
      <div class="btn">
        <button class="button-2" type="submit" :disabled="!isFormValid">Send</button>
      </div>
    </form>
  </div>
</template>

<script lang="ts">
import { useFormStore } from '../stores/useFormStore'
import { storeToRefs } from 'pinia'

const formStore = useFormStore()
const { name, email, message, isFormValid } = storeToRefs(formStore)
const { submitForm } = formStore

export default {
  name: 'FormBlock',
  setup() {
    return { name, email, message, isFormValid, submitForm }
  },
}
</script>

<style scoped>
h1 {
  font-weight: 500;
  font-size: 2.6rem;
  position: relative;
  top: -10px;
}

h3 {
  font-size: 1.2rem;
}


.greetings h1,
.greetings h3 {
  text-align: center;
}
.template {
  display: flex;
  justify-content: center;
  align-items: center;
}

.form {
  display: flex;
  justify-content: left;
  align-items: left;
  width: 100%;

}
.formblock{
  margin: auto;
  border-radius: 8px;
  width: var(--card-width);

  background: rgb(255, 255, 255);
  color: black;

  box-shadow: 5 5 10px rgba(0,0,0,1);

}
.formblock > div {
  width: 100%;
  padding: 10px;
}

.formblock > div > label {
  display: block;
  margin-bottom: 0rem;
  padding-bottom: 0rem;
  width: 200px;
  text-align: left;
}

.formblock > div > input {
  display: block;
  margin-top: 0rem;
  padding-top: 0rem;
  width: 100%;
  height: 30px;
  border: 1px solid gainsboro;
  border-radius: 5px;
  padding: 1rem;

  margin: auto;
}
.formblock > div > textarea {
  display: block;
  margin-top: 0rem;
  padding-top: 0rem;
  width: 100%;
  height: 30px;
  border-radius: 5px;
  padding: 0.5rem;
  resize: vertical;
  height: 150px;
}

/* CSS */
.button-2 {
  background-color: rgba(51, 51, 51, 0.05);
  border-radius: 8px;
  border-width: 0;
  width: 100%;
  color: #ffffff;
  background-color: rgb(50, 216, 0);
  cursor: pointer;
  display: inline-block;
  font-family: 'Haas Grot Text R Web', 'Helvetica Neue', Helvetica, Arial, sans-serif;
  font-size: 14px;
  font-weight: 500;
  line-height: 20px;
  list-style: none;
  margin: auto;
  padding: 10px 12px;
  text-align: center;
  transition: all 200ms;
  vertical-align: baseline;
  white-space: nowrap;
  user-select: none;
  -webkit-user-select: none;
  touch-action: manipulation;
}
.button-2:disabled {
  background-color: rgba(187, 187, 187, 0.945);
  color: rgba(51, 51, 51, 0.3);
}
</style>
