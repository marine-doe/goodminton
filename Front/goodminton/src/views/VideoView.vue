<template>
<div>
    <youtube-search></youtube-search>
    <youtube-search-result></youtube-search-result>
</div>
</template>

<script>
import YoutubeSearch from "../components/video/YoutubeSearch.vue"
import YoutubeSearchResult from "../components/video/YoutubeSearchResult.vue"

export default {  
    name:'YoutubeView',
    components:{
        YoutubeSearch,
        YoutubeSearchResult,
    },
    data(){
    },
    methods: {
       
    },
}
</script>

<style>
    h2 {
        color :red;
    }
</style>