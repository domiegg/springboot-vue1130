const base = {
    get() {
        return {
            url : "http://localhost:8080/zaixiankechengguanlixitong/",
            name: "zaixiankechengguanlixitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zaixiankechengguanlixitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "t在线课程管理系统"
        } 
    }
}
export default base
