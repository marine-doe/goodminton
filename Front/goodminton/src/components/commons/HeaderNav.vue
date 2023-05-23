<template>
    <div>
      <header id="header" class="fixed-top d-flex align-items-center">
      <div class="container d-flex align-items-center justify-content-between">

      <div class="logo">
        <h1 class="text-light"><router-link to="/">Badminton</router-link></h1>
        <!-- Uncomment below if you prefer to use an image logo -->
        <!-- <a href="index.html"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->
      </div>

      <nav id="navbar" class="navbar">
        <ul>
          <div v-if="loginUser" class="box">
            <li><div class="h2 mb-0"><b-icon icon="bell"></b-icon></div></li>
            <li><router-link to="/game">경기장 예약(?)</router-link></li>
            <li><router-link to="/mypage" v-if="loginUser">마이페이지</router-link></li>
            <li @click="logout"><router-link to="" v-if="loginUser">로그아웃</router-link></li>
          </div>
          <div v-else class="box"> 
            <li><router-link to="/api/login" >로그인</router-link></li>
            <li><router-link to="/api/signup">회원가입</router-link></li>
          </div>

          <!-- <li><a class="getstarted"><router-link to="/signup" class="log">회원가입</router-link></a></li>
          <li><a class="getstarted"><router-link to="/login">로그인</router-link></a></li> -->
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav>
    </div>
  </header>
    </div>
</template>

<script>
import {mapState} from "vuex";

export default {
    name : 'HeaderNav',
    methods: {
        logout(){
            this.$store.commit("LOGOUT");
        },
    },
    computed:{
        ...mapState(["loginUser"]),
        getUser(){
            if(this.loginUser){
                return true;
            }else{
                return false;
            }
        }
    },
};
</script>

<style scoped>
.log{
    text-decoration:none; 
    color: white;
    text-align: left;
}

.box {
  display: flex;
}
</style>