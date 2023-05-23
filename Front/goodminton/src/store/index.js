import Vue from 'vue'
import Vuex from 'vuex'
import axios from "axios";
import router from "@/router";

Vue.use(Vuex)

const REST_API = `http://localhost:9999/api`;

export default new Vuex.Store({
  state: {
    users: [],
    loginUser: null,
    videos:[],
    video:null,
  },
  getters: {
  },
  mutations: {
    CREATE_USER: function (state, user) {
      state.users.push(user);
    },
    SET_LOGIN_USER: function (state, user) {
      state.loginUser = user;
    },
    LOGOUT: function (state) {
      state.loginUser = null;
    },
    SEARCH_YOUTUBE(state, videos){
      state.videos = videos;
    },
    CLICK_VIDEO(state, video){
      state.video = video
    }
  },
  actions: {
    //회원가입
    createUser: function ({ commit }, user) {
      console.log(user)
      const API_URL = `${REST_API}/signup`;
      axios({
        url: API_URL,
        method: "POST",
        params: user,
      })
        .then(() => {
          commit("CREATE_USER", user);
          alert("회원가입을 성공했습니다.");
          router.push("./login");
        })
        .catch((err) => {
          console.log(err);
        });
    },
    //로그인
    setLoginUser: function ({ commit }, user) {
      const API_URL = `${REST_API}/login`;
      axios({
        url: API_URL,
        method: "POST",
        params: user,
      })
        .then((res) => {
          let resUser = res.data;
          console.log(res);
          console.log(user);
          if (resUser.id === user.id && resUser.password === user.password) {
            alert("환영합니다.");
            commit("SET_LOGIN_USER", res.data);
            router.push("/");
          } else {
            alert("아이디와 비밀번호를 다시 확인해주세요.");
          }
        })
        .catch((err) => {
          console.log(err);
        });
    },
    //유투브 검색
    searchYoutube({commit}, keyword){
      console.log(keyword);
      const URL = "https://www.googleapis.com/youtube/v3/search";
      const API_KEY = process.env.VUE_APP_YOUTUBE_API_KEY;
      axios({
        url:URL,
        method: "GET",
        params:{
          key:API_KEY,
          part: "snippet",
          q: keyword,
          type:"video",
          maxResults:6,
        },
      })
      .then((res) =>{
        commit("SEARCH_YOUTUBE", res.data.items)
      })
      .catch((err)=>{
      console.log(err)
      console.log('안되네')
    })
    },
    //유투브 클릭
    clickVideo({commit}, payload){
      commit("CLICK_VIDEO", payload)
    },
  },
  modules: {
  }
})
