<script setup lang="ts">
import { RouterLink, RouterView } from 'vue-router'
// import HelloWorld from './components/HelloWorld.vue'
</script>

<template>
  <header>
    <div class="wrapper">
      <!-- <HelloWorld /> -->

      <nav>
        <RouterLink to="/" class="home">Home</RouterLink>
        <RouterLink to="/calculator" class="calc">Calculator</RouterLink>
        <RouterLink to="/contact" class="contact">Contact</RouterLink>
      </nav>
    </div>
  </header>

  <RouterView />
</template>

<style scoped>
header {
  line-height: 1.5;
}

.wrapper {
  padding: 10px;
  margin: auto;

  margin-bottom: 20px;
  justify-content: center;
  align-items: center;
  background-image: url('./assets/bggif.gif');
  background-size: cover;
  background-position: center;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  border-radius: 5px;
  width: var(--card-width);
}
nav {
  width: 100%;
  font-size: 14px;
  text-align: center;
  justify-content: space-around;
  margin-top: 2rem;
  border-radius: 8px;
}

nav a.router-link-exact-active {
  background-color: rgb(222, 222, 222);
  color: rgb(0, 0, 0);
}

nav a.router-link-exact-active:hover {
  background-color: transparent;
}

nav a {
  display: inline-block;
  padding: 1 1rem;
  border-left: 1px solid var(--color-border);
  background-color: rgb(255, 255, 255);
  margin-left: 20px;
  margin-right: 20px;
  margin-bottom: 20px;
  padding: 15px;
  border-radius: 25%;
}

nav a:first-of-type {
  border: 0;
}

/* @media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
    width: 100%;
    justify-content: center;
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }

  nav {
    text-align: left;
    margin-left: -1rem;
    font-size: 1rem;

    padding: 1rem 0;
    margin-top: 1rem;
  }
} */
</style>
