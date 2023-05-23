<template>
  <div class="start container">
    <form class="form-inline d-flex justify-content-center md-form form-sm">
      <input class="form-control form-control-sm mr-3 w-75 hei" type="text" placeholder="Search"
        aria-label="Search" v-model="keyword">
      <b-icon @click="search" icon="search"></b-icon>
    </form>

    <div class="button d-flex justify-content-center">
      <b-button class="button-1" variant="success" @click="BWF">수디르만컵</b-button>
      <b-button class="button-1" variant="success" @click="clear">클리어</b-button>
      <b-button class="button-1" variant="success" @click="smash">스매시</b-button>
      <b-button class="button-1" variant="success" @click="drop">드롭</b-button>
      <b-button class="button-1" variant="success" @click="drive">드라이브</b-button>
      <b-button class="button-1" variant="success" @click="push">푸시</b-button>
      <b-button class="button-1" variant="success" @click="hairpin">헤어핀</b-button>
      <b-button class="button-1" variant="success" @click="returnBad">리턴</b-button>
    </div>

  </div>
</template>

<script>
export default {
    name:'VideoView',
    data(){
      return{
        keyword:"",
      }
    },
    methods:{
      search(){
        this.$store.dispatch("searchYoutube", this.keyword);
      },
      BWF(){
        this.$store.dispatch("searchYoutube","수디르만컵");
      },
      clear(){
        this.$store.dispatch("searchYoutube","배드민턴 클리어");
      },
      smash(){
        this.$store.dispatch("searchYoutube","배드민턴 스메시");
      },
      drop(){
        this.$store.dispatch("searchYoutube","배드민턴 드롭");
      },
      drive(){
        this.$store.dispatch("searchYoutube","배드민턴 드라이브");
      },
      push(){
        this.$store.dispatch("searchYoutube","배드민턴 푸시");
      },
      hairpin(){
        this.$store.dispatch("searchYoutube","배드민턴 헤어핀");
      },
      returnBad(){
        this.$store.dispatch("searchYoutube","배드민턴 리턴");
      },
    }
}
</script>

<style scoped>
.start{
  margin-top:100px;
}
.search{
  width: 300px;
}
.hei{
  height:40px;
}
.button{
  padding:20px;
}
.button-1{
  margin-left: 10px;
  margin-right: 10px;
}
</style>