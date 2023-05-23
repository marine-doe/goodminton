import Vue from 'vue'
import VueRouter from 'vue-router'
// import StartView from '../views/StartView.vue'
import HomeView from '../views/HomeView.vue'
import BookView from '../views/BookView.vue'

import LoginForm from '../components/user/LoginForm'
import UserRegist from '../components/user/UserRegist'
import GameReverse from '../components/badminton/GameReverse'
import MyPage from '../components/MyPage'
// import GameList from '../components/badminton/GameList'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path:'/api/signup',
    name: 'UserRegist',
    component: UserRegist
  },
  {
    path:'/api/login',
    name: 'login',
    component: LoginForm
  },
  {
    path:'/game',
    component: BookView,
    children:[
      {
        path:'reverse',
        name:'GameReverse',
        component: GameReverse
      },
    ]
  },
  {
    path:'/mypage',
    name: 'MyPage',
    component: MyPage
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
