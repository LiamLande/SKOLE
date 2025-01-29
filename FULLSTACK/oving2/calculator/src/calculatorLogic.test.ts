import { expect, test } from 'vitest'
import { handleInput } from './calculatorLogic'

test('handleInput', () => {
  const state = { result: '0', history: [] }
  handleInput(state, '1')
  expect(state.result).toBe('1')
  handleInput(state, '+')
  expect(state.result).toBe('1+')
  handleInput(state, '2')
  expect(state.result).toBe('1+2')
  handleInput(state, '=')
  expect(state.result).toBe(3)
  expect(state.history[0]).toEqual('1+2=3')
  handleInput(state, 'C')
  expect(state.result).toBe('0')
  expect(state.history[0]).toEqual('1+2=3')
  expect(state.history[1]).toEqual('')
})
