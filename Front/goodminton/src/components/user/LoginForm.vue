<template>
 <div>
    <div class="background">
      <div>
        <b-navbar class="navbar" toggleable="lg" type="info">
          <router-link class="badminton-Home" to="/">BADMINTON</router-link>

        <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>
        </b-navbar>
    </div>

      <div>
        <div class="box">
          <b-form>

          <h3 class="name"><br>Badminton</h3>

          <b-form-group class="box-size" id="fieldset-1" label="아이디" label-for="input-1" >
            <b-form-input id="input-1" v-model="id" trim></b-form-input>
          </b-form-group>


          <b-form-group class="box-size" id="fieldset-1" label="비밀번호" label-for="input-1">
            <b-form-input id="input-1" v-model="password" :state="state" trim></b-form-input>
          </b-form-group>

          <b-button @click="login" variant="outline-success" class="button">로그인</b-button>
      </b-form>
        </div>
      </div>      
    </div>
  </div>
</template>

<script>
export default {
    name:'LoginFrom',
    data(){
      return{
        id:"",
        password:"",
      };
    },
    methods:{
      login(){
        if(
          this.id === "" ||
        this.password === ""
        ){
        alert("빠짐없이 입력하세요.");
        return;
      }

        let user={
          id: this.id,
          password: this.password,
        };
        this.$store.dispatch("setLoginUser", user);
      }
    }
}
</script>

<style scoped>
.background{
  background: #94c045;
  width: 100%;
  height: 100vh;
}
.box{
  width: 450px;
  height: 500px;
  background-color: white;
  display : block;
  margin-left: auto;
  margin-right: auto;
  margin-top: 150px;
  /* background-color: rgba(0, 0, 0, 0.6); */
  border-radius: 1%;
  opacity: 90%;
}

.name{
  text-align: center;
  font-size: 50px;
  font-weight: bold;
  color : #94c045;
  margin-bottom: 30px;
}
.box-size{
  width: 300px;
  display : block;
  margin-left: auto;
  margin-right: auto;
}
.button{
  margin-top:40px;
 margin-left: auto;
  margin-right: auto;
  display : block;
  height:50px;
  width: 120px;
}
</style>