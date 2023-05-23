<template>
  <div class="start">
     <router-link to="/game/reverse">예약하기</router-link>
    <gamelist></gamelist>
  <router-view></router-view>
  </div>
</template>

<script>
import GameList from '../components/badminton/GameList.vue'
export default {
    name:'BookView',
    components:[
      GameList,
    ]
}
</script>

<style>
.start{
  margin-top:100px;
}
</style>