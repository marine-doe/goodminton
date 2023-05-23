<template>
  <div>
    <video-view></video-view>
    <router-view></router-view>
  </div>
</template>

<script>
import VideoView from './VideoView.vue';


export default {
  name: 'HomeView',
  components: {
    VideoView,
  }
}
</script>

<style>
.left{
  width:50%;
  float:left;
  box-sizing: border-box;
}
.right{
  width:50%;
  float:right;
  box-sizing: border-box;
}
</style>