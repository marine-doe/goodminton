<template>
    <div class="youtube-list">
        <div @click="clickVideo">
            <div class="box" v-for="video in videos" :key=video.id.videoId>
                <iframe
                width="560"
                height="315"
                :src="`https://www.youtube.com/embed/${video.id.videoId}`"
                title="YouTube video player"
                frameborder="0"
                allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
                allowfullscreen
                ></iframe>
            </div>
        </div>
    </div>
</template>

<script>
import {mapState} from 'vuex';

export default {
    name : "YoutubeSearchResult",
    components:{
    },
    computed:{
        ...mapState(['videos']),
    },
    methods: {
        clickVideo(){
            this.$store.dispatch('clickVideo', this.video);
        },
    },
}
</script>


<style scoped>
    .youtube-list{
        float:left;
        display: block;
            margin-left: auto;
            margin-right: auto;
            text-align: center;
    }
    .box{
        display: inline-block;
        margin:10px;
    }
</style>