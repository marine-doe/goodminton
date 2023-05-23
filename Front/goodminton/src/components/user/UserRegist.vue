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

          <b-form-group class="box-size" id="fieldset-1" label="비밀번호 확인" label-for="input-1" valid-feedback="올바른 비밀번호입니다!"
            :invalid-feedback="invalidFeedback" :state="state">
            <b-form-input id="input-1" v-model="passwordCheck" :state="state" trim></b-form-input>
          </b-form-group>

          <b-form-group class="box-size" id="fieldset-1" label="이름" label-for="input-1" >
            <b-form-input id="input-1" v-model="name" trim></b-form-input>
          </b-form-group>

          <b-form-group class="box-size" id="fieldset-1" label="이메일" label-for="input-1" >
            <b-form-input id="input-1" v-model="email" trim></b-form-input>
          </b-form-group>

          <b-button @click="regist" variant="outline-success" class="button">회원가입</b-button>
      </b-form>
        </div>
      </div>      
    </div>
  </div>
</template>

<script>
export default {
    name : 'UserRegist',
    data(){
      return{
        id:"",
        password:"",
        passwordCheck:"",
        name:"",
        email:"",
      };
    },
    computed:{
      state() {
        // return this.password.length >= 8
        return this.password === this.passwordCheck && this.password.length > 0
      },
      invalidFeedback() {
        // if (this.password.length > 0) {
        //   return '비밀번호는 8~20자 사이여야 합니다.'
        // }
        if(this.password.length > 0 || this.password !== this.passwordCheck){
          return '비밀번호가 틀립니다.'
        }
        return ''
      },
    },
    methods:{
      regist(){
        if(
        this.id === "" ||
        this.password === "" ||
        this.passwordCheck === "" ||
        this.name === "" ||
        this.email === "" ||
        this.password !== this.passwordCheck
        ){
        alert("빠짐없이 입력하세요.");
        return;
      }
      let user = {
        id: this.id,
        password: this.password,
        name: this.name,
        email: this.email,
      };
      this.$store.dispatch("createUser",user);
      },
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
  height: 700px;
  background-color: white;
  display : block;
  margin-left: auto;
  margin-right: auto;
  margin-top: 100px;
  /* background-color: rgba(0, 0, 0, 0.6); */
  border-radius: 1%;
  opacity: 90%;
}

.name{
  text-align: center;
  font-size: 50px;
  font-weight: bold;
  color : #94c045;
  /* margin-top: 20px; */
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