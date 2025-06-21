
var projectName = '乒乓球馆预约管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '乒乓球场',
	url: './pages/pingpangqiuchang/list.html'
}, 

{
	name: '公告信息',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/springboots2409/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"乒乓球场","menuJump":"列表","tableName":"pingpangqiuchang"}],"menu":"乒乓球场管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除"],"menu":"场地类型","menuJump":"列表","tableName":"changdileixing"}],"menu":"场地类型管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","删除","审核","修改"],"menu":"场地预约","menuJump":"列表","tableName":"changdiyuyue"}],"menu":"场地预约管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["审核","删除","查看"],"menu":"暂离申请","menuJump":"列表","tableName":"zanlishenqing"}],"menu":"暂离申请管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","删除","审核"],"menu":"离开申请","menuJump":"列表","tableName":"likaishenqing"}],"menu":"离开申请管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","回复","删除"],"menu":"留言反馈","tableName":"messages"}],"menu":"留言反馈"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","预约"],"menu":"乒乓球场列表","menuJump":"列表","tableName":"pingpangqiuchang"}],"menu":"乒乓球场模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改","删除","暂离","离开"],"menu":"场地预约","menuJump":"列表","tableName":"changdiyuyue"}],"menu":"场地预约管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["删除","修改","查看"],"menu":"暂离申请","menuJump":"列表","tableName":"zanlishenqing"}],"menu":"暂离申请管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","修改","删除"],"menu":"离开申请","menuJump":"列表","tableName":"likaishenqing"}],"menu":"离开申请管理"},{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","修改","删除"],"menu":"留言反馈","tableName":"messages"}],"menu":"留言反馈"},{"child":[{"appFrontIcon":"cuIcon-favor","buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","预约"],"menu":"乒乓球场列表","menuJump":"列表","tableName":"pingpangqiuchang"}],"menu":"乒乓球场模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
