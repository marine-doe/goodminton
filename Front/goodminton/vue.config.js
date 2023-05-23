const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})
module.exports = {

  /* 이미지 파일 (svg 제외) */
  // config.module.rule('images')
  //   //.test(/\.(png|jpe?g|gif)(\?.*)?$/)
  //   .use('url-loader').loader('url-loader')
  //   .tap(options => Object.assign(options, { esModule: false }));
    
  // /* svg 파일 */
  // config.module.rule('svg')
  //   .use('file-loader')
  //   .loader('file-loader')
  //   .tap(options => Object.assign(options, { esModule: false }));
}