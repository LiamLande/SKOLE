import { defineStore } from 'pinia';

export const useFormStore = defineStore('form', {
  state: () => ({
    name: '',
    email: '',
    message: ''
  }),
  getters: {
    isNameValid: (state) => state.name.trim().length > 0,
    isEmailValid: (state) => {
      const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
      return emailPattern.test(state.email);
    },
    isFormValid: (state) => state.message.trim().length > 0 && state.name.trim().length > 0 && state.email.trim().length > 0
  },
  actions: {
    submitForm() {
         // Handle form submission
        // alert('Form submitted! ' + this.name + ' ' + this.email + ' ' + this.message);
        fetch('http://localhost:3000/forms', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                name: this.name,
                email: this.email,
                message: this.message
            })
        })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
        })
        .catch((error) => {
            console.error('Error:', error);
        });

        // Reset form
        this.name = '';
        this.email = '';
        this.message = '';

      
    }
  }
});