<template>
  <div class="item">

    <div class="details">
      <h3>Welcome to my calculator app</h3>

      <p>
        This is a calculator app that can do basic arithmetic operations and take in feedback.
      </p>
    </div>
  </div>
</template>

<style scoped>
.item {
  margin-top: 2rem;
  display: flex;
  position: relative;
  padding: 1rem;
  border-radius: 8px;
  background: var(--color-background);
  color: black;
  width: var(--card-width);
  margin: auto;
}

.details {
  flex: 1;
  margin-left: 1rem;
}

i {
  display: flex;
  place-items: center;
  place-content: center;
  width: 32px;
  height: 32px;

}

h3 {
  font-size: 1.2rem;
  font-weight: 500;
  margin-bottom: 0.4rem;
}

</style>
