// src/calculatorLogic.ts

export interface CalculatorState {
  result: string
  history: string[]
}

export function createCalculatorState(): CalculatorState {
  return {
    result: '0',
    history: [],
  }
}

export function handleInput(state: CalculatorState, input: string): void {
  if (input === 'C') {
    state.result = '0'
    state.history.push('')
  } else if (input === '=') {
    try {
      const temp = state.result
      state.result = eval(state.result) // Note: Using eval is not recommended for production code
      state.history.push(temp + '=' + state.result)
    } catch {
      state.result = 'Error'
    }
  } else {
    if (state.result === '0' && !isNaN(Number(input))) {
      state.result = input
    } else {
      state.result += input
    }
    state.history[-1] += input + ''
  }
}

// function evalInput(input: string): string {
//     const input_arr = input.split(/([+\-*/])/);
//     let result = 0;
//     if (input_arr.length === 1 || isNaN(Number(input_arr[input_arr.length - 1]))) {
//         return String(input_arr[0]);
//     }

// }
