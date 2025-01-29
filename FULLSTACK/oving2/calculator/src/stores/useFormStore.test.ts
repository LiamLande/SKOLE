// stores/counter.spec.ts
import { setActivePinia, createPinia } from 'pinia'
import { useFormStore } from './useFormStore'
import { beforeEach, describe, expect, it } from 'vitest'

describe('Form Store', () => {
  beforeEach(() => {
    // creates a fresh pinia and makes it active
    // so it's automatically picked up by any useStore() call
    // without having to pass it to it: `useStore(pinia)`
    setActivePinia(createPinia())
  })

  it('Validates Name', () => {
    const formStore = useFormStore()
    formStore.name = 'John Doe'
    expect(formStore.isNameValid).toBe(true)
    formStore.name = ''
    expect(formStore.isNameValid).toBe(false)
  })

  it('Validates Email', () => {
    const formStore = useFormStore()
    formStore.email = 'test@gmail.com'
    expect(formStore.isEmailValid).toBe(true)
    formStore.email = 'test'
    expect(formStore.isEmailValid).toBe(false)
  })

  it('Validates Form', () => {
    const formStore = useFormStore()
    formStore.name = 'John Doe'
    formStore.email = 'test@gmail.com'
    formStore.message = 'Hello'
    expect(formStore.isFormValid).toBe(true)
  })
})
