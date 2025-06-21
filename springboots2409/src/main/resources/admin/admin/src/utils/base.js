const base = {
    get() {
        return {
            url : "http://localhost:8080/springboots2409/",
            name: "springboots2409",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboots2409/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "乒乓球馆预约管理系统"
        } 
    }
}
export default base
