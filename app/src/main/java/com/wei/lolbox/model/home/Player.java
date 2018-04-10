package com.wei.lolbox.model.home;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者：赵若位
 * 时间：2017/12/23
 * 邮箱：1070138445@qq.com
 * 功能：直播数据模型
 */

public class Player
{
    /**
     * id : 8
     * name : 热门推荐
     * type : 1005
     * url :
     * icon : 104
     * sort : 60
     * head : 1
     * pageable : 1
     * gameStyle : 0
     * uninterested : 1
     * modules : [{"id":102,"name":"主播排行榜","type":2004,"url":"yymobile://Web/Features/5/Url/http%253A%252F%252Fweb.yy.com%252Fgroup_act%252FhoursList%252F%2523%252FcurList","sort":9,"head":0,"pageable":0,"gameStyle":0,"uninterested":0,"data":[{"id":2236,"sort":1,"type":22,"scale":0,"style":0,"title":"全YY也只有她能凑齐哲佑利，九辰快乐到场道贺","thumb":"http://emyfs.bs2cdn.yy.com/MTI3NTRlMGMtYmNlMC00M2I0LWE2YjYtZTkzYTUzZWNhODEy.jpg","url":"yymobile://Web/Features/5/Url/http%253A%252F%252Fwww.yy.com%252Fyue%252Fmsg%252F82761","desc":"一个有着外站一姐称号，年收入1600万的女主播"},{"id":2237,"sort":1,"type":22,"scale":0,"style":0,"title":"小白龙直播间向九辰道歉？","thumb":"http://emyfs.bs2cdn.yy.com/MTI3NTRlMGMtYmNlMC00M2I0LWE2YjYtZTkzYTUzZWNhODEy.jpg","url":"yymobile://Web/Features/5/Url/http%253A%252F%252Fwww.yy.com%252Fyue%252Fmsg%252F82793","desc":"小白龙经过了之前的一系列的事件之后，最终还是回归舞帝"}]}]
     * data : [{"sort":0,"biz":"pet","type":1,"scale":0,"gameStyle":0,"uid":1861118716,"sid":1349611145,"ssid":1349611145,"name":"萌宠75-Michael","desc":"汪星人圣诞节的那些事","startTime":1514014415,"liveTime":472,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/11/1861118716/u1861118716Xd8bob_.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/OThkM2U4YTUtNjBjOC00YjE0LTgxZjQtMmNjYjhkZjZlOGJl.jpg?imageview/4/3/w/368/h/207/blur/1","users":19790,"tagStyle":0,"tpl":16777217,"yyNum":2113774874,"thumb2":"http://emyfs.bs2cdn.yy.com/OThkM2U4YTUtNjBjOC00YjE0LTgxZjQtMmNjYjhkZjZlOGJl.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/OThkM2U4YTUtNjBjOC00YjE0LTgxZjQtMmNjYjhkZjZlOGJl.jpg?imageview/4/0/w/363/h/330/blur/1","pid":"15013x03_1349611145_1861118716_1514014414_1514014414","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17123862f1b1a1272bac20df855d5a8d2cea4d6ce6f0?imageview/4/0/w/363/h/330/blur/1","ru":18,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":4448,"arGame":0,"site":"广州市","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"talk","type":4,"scale":0,"gameStyle":0,"uid":1092868475,"sid":84865255,"ssid":84865255,"name":"洛瑶","desc":"没错，就是那个洛瑶","startTime":1514012880,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/86/1092868475/u1092868475vDW3gej.png","thumb":"http://emyfs.bs2cdn.yy.com/MDZmYTYwZGItNzRmMy00ODJhLWJjNDAtZTNiYzQ0ZTA2ZmMz.jpg?imageview/4/0/w/363/h/330/blur/1","users":11469,"tagStyle":0,"tpl":16777217,"yyNum":5850511,"thumb2":"http://emyfs.bs2cdn.yy.com/MDZmYTYwZGItNzRmMy00ODJhLWJjNDAtZTNiYzQ0ZTA2ZmMz.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/MDZmYTYwZGItNzRmMy00ODJhLWJjNDAtZTNiYzQ0ZTA2ZmMz.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712c169073cca9e199b7ce6421b7dcb2d24084b7bba?imageview/4/0/w/363/h/330/blur/1","ru":623,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1433,"arGame":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":1808087682,"sid":54873568,"ssid":54873568,"name":"大美丽","desc":"户外长腿美女大美丽","startTime":1514004516,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/08/1808087682/u1808087682AgW77mF.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/Y2I4MTExZmEtNTA1Yi00ODVkLWI4NDEtZWMzZjc5MDc0Y2Zl.jpg?imageview/4/0/w/363/h/330/blur/1","users":2134,"tagStyle":0,"tpl":16777217,"yyNum":2060624938,"thumb2":"http://emyfs.bs2cdn.yy.com/Y2I4MTExZmEtNTA1Yi00ODVkLWI4NDEtZWMzZjc5MDc0Y2Zl.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/Y2I4MTExZmEtNTA1Yi00ODVkLWI4NDEtZWMzZjc5MDc0Y2Zl.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712ba88fe358fff6d03a23fcf451d9552ad513e71bb?imageview/4/0/w/363/h/330/blur/1","ru":79,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1886,"arGame":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":1428596228,"sid":19108566,"ssid":19108566,"name":"小露娜","desc":"好声音女王小露娜","startTime":1514011268,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/59/1428596228/u1428596228quAwydQ.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/NDljNWJmOGMtNWE4NC00MWU3LWIwZGYtMmI4ZjY1NmNjNjgw.jpg?imageview/4/0/w/363/h/330/blur/1","users":10138,"tagStyle":0,"tpl":16777217,"yyNum":281052,"thumb2":"http://emyfs.bs2cdn.yy.com/NDljNWJmOGMtNWE4NC00MWU3LWIwZGYtMmI4ZjY1NmNjNjgw.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/NDljNWJmOGMtNWE4NC00MWU3LWIwZGYtMmI4ZjY1NmNjNjgw.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17126c2f749c868336c1a03e47da227003ecc8292db5?imageview/4/0/w/363/h/330/blur/1","ru":1637,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":5977,"arGame":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":1153964001,"sid":84506543,"ssid":84506543,"name":"DZ小五","desc":"天籁之音小五","startTime":1514009623,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/96/1153964001/u1153964001mJEAtI2.jpg","thumb":"http://emyfs.bs2cdn.yy.com/ODE4MTAyODMtZTc2YS00MjIwLWJmZGUtMTJiMTUwMzlhZTJh.jpg?imageview/4/0/w/363/h/330/blur/1","users":4803,"tagStyle":0,"tpl":16777217,"yyNum":1241918206,"thumb2":"http://emyfs.bs2cdn.yy.com/ODE4MTAyODMtZTc2YS00MjIwLWJmZGUtMTJiMTUwMzlhZTJh.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/ODE4MTAyODMtZTc2YS00MjIwLWJmZGUtMTJiMTUwMzlhZTJh.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712ab28589a428dc4483d52c04e17e5f2794215dcc4?imageview/4/0/w/363/h/330/blur/1","ru":159,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1816,"arGame":0},{"sort":0,"biz":"talk","type":4,"scale":0,"gameStyle":0,"uid":1105307458,"sid":18411323,"ssid":18411323,"name":"大圣","desc":"YY第一猴大圣","startTime":1514013242,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/30/1105307458/u1105307458siKbsVn.png","thumb":"http://emyfs.bs2cdn.yy.com/YTdkZDM5ZmEtNDE1Ni00ZmUzLWI3MzEtZjFiYjMxODkwMmQw.jpg?imageview/4/0/w/363/h/330/blur/1","users":21999,"tagStyle":0,"tpl":16777217,"yyNum":6939485,"thumb2":"http://emyfs.bs2cdn.yy.com/YTdkZDM5ZmEtNDE1Ni00ZmUzLWI3MzEtZjFiYjMxODkwMmQw.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/YTdkZDM5ZmEtNDE1Ni00ZmUzLWI3MzEtZjFiYjMxODkwMmQw.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171275e74a9bc2bad2d4ef795bebc716789bba7fc953?imageview/4/0/w/363/h/330/blur/1","ru":298,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2776,"arGame":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":1816335755,"sid":98269386,"ssid":98269386,"name":"【鉑】＂ 楠宝","desc":"气质女神楠宝","startTime":1514012581,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/33/1816335755/u1816335755Jfhrlod.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/MGU4ZjAzN2QtN2QxNy00MDliLTg2NzgtZTJkM2FlZTA4YjNh.jpg?imageview/4/0/w/363/h/330/blur/1","users":1130,"tagStyle":0,"tpl":16777217,"yyNum":2068953055,"thumb2":"http://emyfs.bs2cdn.yy.com/MGU4ZjAzN2QtN2QxNy00MDliLTg2NzgtZTJkM2FlZTA4YjNh.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/OTE3YWZkOTAtYjVmYS00ZjBlLTkxMmEtODc1NTE1NmUwOTRi.gif","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712ceb945673671feca06c80f4ffb9e115d52430da3?imageview/4/0/w/363/h/330/blur/1","ru":97,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1651,"arGame":0},{"sort":0,"biz":"car","type":1,"scale":0,"gameStyle":0,"uid":1729802284,"sid":94369579,"ssid":94369579,"name":"甜心糖糖","desc":"哥哥，我\u2026\u2026","startTime":1514010503,"liveTime":4384,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/80/1729802284/u1729802284t02XRzu.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/NmEwOTVkYzEtZDdlNi00NWNkLWE0MDYtYTBmOTU4OTJmOWVi.jpg?imageview/4/3/w/368/h/207/blur/1","users":121,"tagStyle":0,"tpl":16777217,"yyNum":1976113917,"thumb2":"http://emyfs.bs2cdn.yy.com/NmEwOTVkYzEtZDdlNi00NWNkLWE0MDYtYTBmOTU4OTJmOWVi.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/NmEwOTVkYzEtZDdlNi00NWNkLWE0MDYtYTBmOTU4OTJmOWVi.jpg?imageview/4/0/w/363/h/330/blur/1","pid":"15013x03_94369579_1729802284_1514010503_1514010201","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712d707650dc35e34a46a449118200a5de5f28b6852?imageview/4/0/w/363/h/330/blur/1","ru":50,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1072,"arGame":0,"site":"河池市","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":128390340,"sid":27302019,"ssid":27302019,"name":"东方Baby","desc":"人美歌甜东方宝宝","startTime":1514005353,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/39/0128390340/u128390340qRm4nJPM.png","thumb":"http://emyfs.bs2cdn.yy.com/ZDliZmUwNjktMWVmZC00NGQxLThhNGQtMjE5ZGVmOWUxOWZl.jpg?imageview/4/0/w/363/h/330/blur/1","users":7093,"tagStyle":0,"tpl":16777217,"yyNum":47962,"thumb2":"http://emyfs.bs2cdn.yy.com/ZDliZmUwNjktMWVmZC00NGQxLThhNGQtMjE5ZGVmOWUxOWZl.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/ZDliZmUwNjktMWVmZC00NGQxLThhNGQtMjE5ZGVmOWUxOWZl.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712b2e1e8eed8d44ca86c3f52be02633667aa363278?imageview/4/0/w/363/h/330/blur/1","ru":1047,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":943,"arGame":0},{"sort":0,"biz":"sport","type":4,"scale":0,"gameStyle":0,"uid":1446781104,"sid":68615016,"ssid":68615016,"name":"小火苗","desc":" 摔角狂魔小火苗","startTime":1514005236,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/78/1446781104/u14467811047z2VfHx.jpg","thumb":"http://emyfs.bs2cdn.yy.com/Njg5ZTM2NmUtMzMyOS00OWI4LWExMDMtMDQwNDdjOGVlN2Yx.jpg?imageview/4/0/w/363/h/330/blur/1","users":4025,"tagStyle":0,"tpl":16777217,"yyNum":1615013679,"thumb2":"http://emyfs.bs2cdn.yy.com/Njg5ZTM2NmUtMzMyOS00OWI4LWExMDMtMDQwNDdjOGVlN2Yx.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/Njg5ZTM2NmUtMzMyOS00OWI4LWExMDMtMDQwNDdjOGVlN2Yx.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171274e42fc2b40d439288d4818001d85ce26205c4d7?imageview/4/0/w/363/h/330/blur/1","ru":808,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2035,"arGame":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":1263135126,"sid":20507371,"ssid":20507371,"name":"7105杨大爷","desc":"迷人微笑杨大爷","startTime":1514011122,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/13/1263135126/u12631351263TOdwB_.png","thumb":"http://emyfs.bs2cdn.yy.com/M2UzMjc1OGYtMjFmYS00MzVjLWEyMDctZjVlNzU3NGUxZDFj.jpg?imageview/4/0/w/363/h/330/blur/1","users":26147,"tagStyle":0,"tpl":16777217,"yyNum":57105,"thumb2":"http://emyfs.bs2cdn.yy.com/M2UzMjc1OGYtMjFmYS00MzVjLWEyMDctZjVlNzU3NGUxZDFj.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/M2UzMjc1OGYtMjFmYS00MzVjLWEyMDctZjVlNzU3NGUxZDFj.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712e77e1ce4695ca87773f756baa4f6dc1c0baf716e?imageview/4/0/w/363/h/330/blur/1","ru":3695,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1347,"arGame":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":1511762106,"sid":1341992660,"ssid":1341992660,"name":"「 H 」.煊 贻爱奇艺：后座上的杀手","desc":"魅惑舞娘煊贻","startTime":1514009647,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/76/1511762106/u1511762106Z_v4FtB.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/YWU4ODM4NGEtNGJkYS00MWI2LWIzYjMtOWVjMzJiODcxY2M1.jpg?imageview/4/0/w/363/h/330/blur/1","users":767,"tagStyle":0,"tpl":16777217,"yyNum":1697018443,"thumb2":"http://emyfs.bs2cdn.yy.com/YWU4ODM4NGEtNGJkYS00MWI2LWIzYjMtOWVjMzJiODcxY2M1.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/ZTUxOWM4MTEtYWYzMC00OTBhLTk4NjgtYjJjNzZkMjAzNzUx.gif","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171210683e76ee7ae1d5063c0822dcaa23bb917734e6?imageview/4/0/w/363/h/330/blur/1","ru":68,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1015,"arGame":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":1328903066,"sid":62637759,"ssid":62637759,"name":"玉baby","desc":"YY劲舞小迪丽热巴","startTime":1514014286,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/90/1328903066/u1328903066WzTYWIX.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/NGMyOTEyYjEtMDFjMS00MDkzLWIyY2EtN2U2NTkzNWJiYzFj.jpg?imageview/4/0/w/363/h/330/blur/1","users":4189,"tagStyle":0,"tpl":16777217,"yyNum":1464419681,"thumb2":"http://emyfs.bs2cdn.yy.com/NGMyOTEyYjEtMDFjMS00MDkzLWIyY2EtN2U2NTkzNWJiYzFj.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/NGMyOTEyYjEtMDFjMS00MDkzLWIyY2EtN2U2NTkzNWJiYzFj.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712b052d1099bfd0bf869dbff0ec13891f70a611f87?imageview/4/0/w/363/h/330/blur/1","ru":86,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":613,"arGame":0},{"sort":0,"biz":"red","type":4,"scale":0,"gameStyle":0,"uid":944944248,"sid":36933349,"ssid":36933349,"name":"小白龙","desc":"户外宗师小白龙","startTime":1514008698,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/94/0944944248/u944944248RiLqEMEb.png","thumb":"http://emyfs.bs2cdn.yy.com/YzZiZmZkYmYtZTkyZi00OWFlLTlmZTgtODE2YzZlMDE0Njg0.jpg?imageview/4/0/w/363/h/330/blur/1","users":43842,"tagStyle":0,"tpl":16777217,"yyNum":523371,"thumb2":"http://emyfs.bs2cdn.yy.com/YzZiZmZkYmYtZTkyZi00OWFlLTlmZTgtODE2YzZlMDE0Njg0.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/YzZiZmZkYmYtZTkyZi00OWFlLTlmZTgtODE2YzZlMDE0Njg0.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17129625a44154f932688c21ef64b88bef1d5a68d111?imageview/4/0/w/363/h/330/blur/1","ru":18983,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1211,"arGame":0},{"sort":0,"biz":"red","type":4,"scale":0,"gameStyle":0,"uid":1106626076,"sid":68586718,"ssid":68586718,"name":"冯小马","desc":"兔女郎投怀送抱","startTime":1514011993,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/62/1106626076/u1106626076iXelm9V.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/ODQwZjhkYzYtZTgwYy00M2RkLTg2NTgtNDk0YmY0YTRkMmU4.jpg?imageview/4/0/w/363/h/330/blur/1","users":7126,"tagStyle":0,"tpl":16777217,"yyNum":3740130,"thumb2":"http://emyfs.bs2cdn.yy.com/ODQwZjhkYzYtZTgwYy00M2RkLTg2NTgtNDk0YmY0YTRkMmU4.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/ODQwZjhkYzYtZTgwYy00M2RkLTg2NTgtNDk0YmY0YTRkMmU4.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712452fbd14200292eada30555b4bd435ef4c4c7865?imageview/4/0/w/363/h/330/blur/1","ru":709,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1093,"arGame":0},{"sort":0,"biz":"talk","type":4,"scale":0,"gameStyle":0,"uid":193010203,"sid":21718060,"ssid":21718060,"name":"九情讲新闻","desc":"歪歪第一新闻直播","startTime":1514010833,"liveTime":0,"avatar":"http://downhdlogo.yy.com/vipsys/51/75/76/4157767551/T1GgdyBKYT1RCvBVdK.png","thumb":"https://zonemin.bs2cdn.yy.com/group16/M00/A8/61/d7wtWVZMOScAAAAAAABKMX6AdqI625.jpg","users":13958,"tagStyle":0,"tpl":16777217,"yyNum":99566,"thumb2":"https://zonemin.bs2cdn.yy.com/group16/M00/A8/61/d7wtWVZMOScAAAAAAABKMX6AdqI625.jpg","img":"https://zonemin.bs2cdn.yy.com/group16/M00/A8/61/d7wtWVZMOScAAAAAAABKMX6AdqI625.jpg","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712f519b871f07e045638723d67e52840769474628c?imageview/4/0/w/363/h/330/blur/1","ru":3026,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1667,"arGame":0},{"sort":0,"biz":"red","type":4,"scale":0,"gameStyle":0,"uid":67585388,"sid":45129995,"ssid":45129995,"name":"风筝","desc":"风筝户外套路王","startTime":1514009004,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/58/0067585388/u67585388uXy8ex_wo.gif","thumb":"http://emyfs.bs2cdn.yy.com/ZmIyN2QxMzQtYzUzYS00MzBmLWI5NzQtZThlYWY4MzQzMDc5.jpg?imageview/4/0/w/363/h/330/blur/1","users":13760,"tagStyle":0,"tpl":16777217,"yyNum":80820586,"thumb2":"http://emyfs.bs2cdn.yy.com/ZmIyN2QxMzQtYzUzYS00MzBmLWI5NzQtZThlYWY4MzQzMDc5.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/ZmIyN2QxMzQtYzUzYS00MzBmLWI5NzQtZThlYWY4MzQzMDc5.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712d362d60ce273f0580990dda4097312cfeb0a1aee?imageview/4/0/w/363/h/330/blur/1","ru":937,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":973,"arGame":0},{"sort":0,"biz":"mc","type":4,"scale":0,"gameStyle":0,"uid":223008233,"sid":21716566,"ssid":21716566,"name":"Mc九局","desc":"喊麦之王MC九局","startTime":1514012775,"liveTime":0,"avatar":"http://downlogo4.yy.duowan.com/user_logo/33/82/00/0223008233/60da8334937e46d1be474e718f6bcd02.png","thumb":"http://emyfs.bs2cdn.yy.com/Y2E5YWMwMDctMjM5Yy00OTc3LTk2YmItOWQ4YWJiOGJiNzZj.jpg?imageview/4/0/w/363/h/330/blur/1","users":51799,"tagStyle":0,"tpl":16777217,"yyNum":99297,"thumb2":"http://emyfs.bs2cdn.yy.com/Y2E5YWMwMDctMjM5Yy00OTc3LTk2YmItOWQ4YWJiOGJiNzZj.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/Y2E5YWMwMDctMjM5Yy00OTc3LTk2YmItOWQ4YWJiOGJiNzZj.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712f080c86a0565b4261b7c9f9cea5dc71e80856de6?imageview/4/0/w/363/h/330/blur/1","ru":5581,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":872,"arGame":0},{"sort":0,"biz":"dance","type":1,"scale":0,"gameStyle":0,"uid":75280698,"sid":55544496,"ssid":55544496,"name":"熙熙","desc":"美丽动人小熙熙","startTime":1514011241,"liveTime":3646,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/28/0075280698/u75280698hKh5-gFSg.png","thumb":"http://emyfs.bs2cdn.yy.com/YzBmY2YwYWMtNjZkZS00MjA4LThmNjQtZWEwNDE3OGRlOGQx.jpg?imageview/4/3/w/368/h/207/blur/1","users":640,"tagStyle":0,"tpl":16777217,"yyNum":26635719,"thumb2":"http://emyfs.bs2cdn.yy.com/YzBmY2YwYWMtNjZkZS00MjA4LThmNjQtZWEwNDE3OGRlOGQx.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/YzBmY2YwYWMtNjZkZS00MjA4LThmNjQtZWEwNDE3OGRlOGQx.jpg?imageview/4/0/w/363/h/330/blur/1","pid":"15013x03_55544496_75280698_1514011240_1514011240","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712fc1537e639445abcbcf6574e57d85501e1d02442?imageview/4/0/w/363/h/330/blur/1","ru":33,"linkMic":2,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2450,"arGame":0,"site":"烟台市","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"mc","type":4,"scale":0,"gameStyle":0,"uid":1009746462,"sid":21533114,"ssid":21533114,"name":"帅总","desc":"最帅男偶像，尊师天佑","startTime":1514012672,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/74/1009746462/u1009746462ADjPR4V.gif","thumb":"http://emyfs.bs2cdn.yy.com/MTIxM2ZkYWItMmJiYy00NzdiLTkyZDgtNjYxN2Y3NjBkNTQz.jpg?imageview/4/0/w/363/h/330/blur/1","users":540,"tagStyle":0,"tpl":16777217,"yyNum":40803,"thumb2":"http://emyfs.bs2cdn.yy.com/MTIxM2ZkYWItMmJiYy00NzdiLTkyZDgtNjYxN2Y3NjBkNTQz.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/MTIxM2ZkYWItMmJiYy00NzdiLTkyZDgtNjYxN2Y3NjBkNTQz.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17126e9a9246990a5e6cd142fcab0fe4073608ec4879?imageview/4/0/w/363/h/330/blur/1","ru":289,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2060,"arGame":0},{"sort":0,"biz":"red","type":1,"scale":0,"gameStyle":0,"uid":1839395536,"sid":72138119,"ssid":72138119,"name":"农村蛋蛋","desc":"农家美食达人蛋蛋","startTime":1514004587,"liveTime":10300,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/39/1839395536/u1839395536QnQXcNG.jpg","thumb":"http://emyfs.bs2cdn.yy.com/MGYyMDQ4MmUtYjNiZi00NDA3LWI3MjItMWYyMTk3YzEyMTM2.jpg?imageview/4/3/w/368/h/207/blur/1","users":449,"tagStyle":0,"tpl":16777217,"yyNum":2092016668,"thumb2":"http://emyfs.bs2cdn.yy.com/MGYyMDQ4MmUtYjNiZi00NDA3LWI3MjItMWYyMTk3YzEyMTM2.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/MGYyMDQ4MmUtYjNiZi00NDA3LWI3MjItMWYyMTk3YzEyMTM2.jpg?imageview/4/0/w/363/h/330/blur/1","pid":"15013x03_72138119_1839395536_1514004587_1514004587","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712aa97ba63b1846381014daf64275a5677121decef?imageview/4/0/w/363/h/330/blur/1","ru":359,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1926,"arGame":0,"site":"安阳市","verify":3,"totalUser":0,"totalLike":0,"quality":1,"deviceType":4,"groupId":0},{"sort":0,"biz":"red","type":1,"scale":0,"gameStyle":0,"uid":1681678144,"sid":1349346555,"ssid":1349346555,"name":"霹雳爷们儿","desc":"霹雳爷们儿正在直播","startTime":1514012382,"liveTime":2505,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/67/1681678144/u1681678144D4j_85h.png","thumb":"http://emyfs.bs2cdn.yy.com/NWM5MTVkNDctN2MyNC00N2Q2LWI5YjItOWU2YzBiYjA4YmI0.jpg?imageview/4/3/w/368/h/207/blur/1","users":284612,"tagStyle":0,"tpl":16777217,"yyNum":1915102672,"thumb2":"http://emyfs.bs2cdn.yy.com/NWM5MTVkNDctN2MyNC00N2Q2LWI5YjItOWU2YzBiYjA4YmI0.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/NWM5MTVkNDctN2MyNC00N2Q2LWI5YjItOWU2YzBiYjA4YmI0.jpg?imageview/4/0/w/363/h/330/blur/1","pid":"15013x03_1349346555_1681678144_1514012382_1514008832","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712a712cd10d11f5a5e93cc1041f148cfebf4d6f9e0?imageview/4/0/w/363/h/330/blur/1","ru":4154,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1449,"arGame":0,"site":"北京市","verify":3,"totalUser":0,"totalLike":0,"quality":3,"deviceType":4,"groupId":0},{"sort":0,"biz":"sport","type":1,"scale":0,"gameStyle":0,"uid":1757771813,"sid":1343813922,"ssid":1343813922,"name":"标力台球🎱","desc":"标力台球🎱正在直播","startTime":1514004430,"liveTime":10457,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/77/1757771813/u17577718134lFyvSy.jpeg","thumb":"http://mobilelivephoto.bs2dl.yy.com/1757771813_1499517002.919702.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","users":88,"tagStyle":0,"tpl":16777217,"yyNum":2010347377,"thumb2":"http://mobilelivephoto.bs2dl.yy.com/1757771813_1499517002.919702.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","img":"http://mobilelivephoto.bs2dl.yy.com/1757771813_1499517002.919702.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","pid":"15013x03_1343813922_1757771813_1514004429_1514004429","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17128d468ccacf119b031b5e18c91f72c965461e8847?imageview/4/0/w/363/h/330/blur/1","ru":39,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1277,"arGame":0,"site":"吉林市","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"talk","type":4,"scale":0,"gameStyle":0,"uid":129390025,"sid":72968544,"ssid":72968544,"name":"Mc天命","desc":"我就是MC天命","startTime":1514008298,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/39/0129390025/u129390025o7IqLtxK.png","thumb":"http://emyfs.bs2cdn.yy.com/MGJhOWZlOWItYjgzMS00N2NhLWFmMWQtYjlhNjUwNDE0ZjMy.jpg?imageview/4/0/w/363/h/330/blur/1","users":4997,"tagStyle":0,"tpl":16777217,"yyNum":5780572,"thumb2":"http://emyfs.bs2cdn.yy.com/MGJhOWZlOWItYjgzMS00N2NhLWFmMWQtYjlhNjUwNDE0ZjMy.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/MGJhOWZlOWItYjgzMS00N2NhLWFmMWQtYjlhNjUwNDE0ZjMy.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171273c2b28272bb958fe50c6ad6fb60dbc114121fe6?imageview/4/0/w/363/h/330/blur/1","ru":570,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2389,"arGame":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":962965066,"sid":96756925,"ssid":96756925,"name":"文静","desc":"百变女神文静","startTime":1514014750,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/96/0962965066/u9629650661pjJ-NY-.png","thumb":"http://emyfs.bs2cdn.yy.com/OGEwNWMxYWEtYTg3NC00NzdhLWFmM2EtNDFmYzAyM2Y1NzQz.jpg?imageview/4/0/w/363/h/330/blur/1","users":20691,"tagStyle":0,"tpl":16777217,"yyNum":41284,"thumb2":"http://emyfs.bs2cdn.yy.com/OGEwNWMxYWEtYTg3NC00NzdhLWFmM2EtNDFmYzAyM2Y1NzQz.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/OGEwNWMxYWEtYTg3NC00NzdhLWFmM2EtNDFmYzAyM2Y1NzQz.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712f66ce1391c8f691fe113faa3863d52c91ad3508b?imageview/4/0/w/363/h/330/blur/1","ru":2646,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1165,"arGame":0},{"sort":0,"biz":"mc","type":4,"scale":0,"gameStyle":0,"uid":1429883581,"sid":62953133,"ssid":62953133,"name":"流氓三金","desc":"霸道总裁流氓三金","startTime":1514007277,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/88/1429883581/u1429883581U_4msUl.png","thumb":"http://emyfs.bs2cdn.yy.com/NTVkMjZhMGEtZTY5OS00YTIxLThhYWMtZjg2NThkYjRkYTY4.jpg?imageview/4/0/w/363/h/330/blur/1","users":189,"tagStyle":0,"tpl":33554521,"yyNum":33293,"thumb2":"http://emyfs.bs2cdn.yy.com/NTVkMjZhMGEtZTY5OS00YTIxLThhYWMtZjg2NThkYjRkYTY4.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/NTVkMjZhMGEtZTY5OS00YTIxLThhYWMtZjg2NThkYjRkYTY4.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712448c6d9757c2237dfa95658c0faa55a5716db470?imageview/4/0/w/363/h/330/blur/1","ru":72,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":2,"frameQa":2322,"arGame":0},{"sort":0,"biz":"red","type":1,"scale":0,"gameStyle":0,"uid":1599748563,"sid":1333567620,"ssid":1333567620,"name":"聚义翡翠","desc":"宝石汇翡翠私人订制","startTime":1514011104,"liveTime":3783,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/74/1599748563/u1599748563L28rl1x.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/MjE1ZWExN2YtOGE4Yi00Y2MxLWE4ZTYtMzFkMWY4YzcxNjY0.jpg?imageview/4/3/w/368/h/207/blur/1","users":277,"tagStyle":0,"tpl":16777217,"yyNum":1809840927,"thumb2":"http://emyfs.bs2cdn.yy.com/MjE1ZWExN2YtOGE4Yi00Y2MxLWE4ZTYtMzFkMWY4YzcxNjY0.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/MjE1ZWExN2YtOGE4Yi00Y2MxLWE4ZTYtMzFkMWY4YzcxNjY0.jpg?imageview/4/0/w/363/h/330/blur/1","pid":"15013x03_1333567620_1599748563_1514011104_1514011040","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17123733a29301f6e921616b369a5774bbdb68eb887e?imageview/4/0/w/363/h/330/blur/1","ru":21,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":632,"arGame":0,"site":"曼德勒","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"red","type":1,"scale":0,"gameStyle":0,"uid":991327576,"sid":33438255,"ssid":33438255,"name":"户外光头强","desc":"野人强野性户外","startTime":1513998230,"liveTime":16657,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/32/0991327576/u991327576Fgj-17X6.jpg","thumb":"http://emyfs.bs2cdn.yy.com/NDVmNTEwMTQtYWZmNS00MWEzLTkyMzQtYmI4YTFhMTBkMDQ4.jpg?imageview/4/3/w/368/h/207/blur/1","users":17524,"tagStyle":0,"tpl":16777217,"yyNum":958227745,"thumb2":"http://emyfs.bs2cdn.yy.com/NDVmNTEwMTQtYWZmNS00MWEzLTkyMzQtYmI4YTFhMTBkMDQ4.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/NDVmNTEwMTQtYWZmNS00MWEzLTkyMzQtYmI4YTFhMTBkMDQ4.jpg?imageview/4/0/w/363/h/330/blur/1","pid":"15013x03_33438255_991327576_1513998230_1513998230","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712038c4bcf0d15af9003fa8d7df125cd65986ae086?imageview/4/0/w/363/h/330/blur/1","ru":3207,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1333,"arGame":0,"site":"宿州市","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":1583171280,"sid":1332512038,"ssid":1332512038,"name":"Linda","desc":"空灵嗓音琳达","startTime":1514013365,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/17/1583171280/u1583171280VtQg77Z.jpeg","thumb":"http://screenshot.dwstatic.com/yysnapshot/17127a8c925a225cbe45a27c42d3170c1f1c774bd9a6?imageview/4/0/w/363/h/330/blur/1","users":1095,"tagStyle":0,"tpl":16777217,"yyNum":1787767758,"thumb2":"https://zonemin.bs2cdn.yy.com/group16/M00/95ca8932ad974c60a491deb114c5f7e8.jpg","img":"https://zonemin.bs2cdn.yy.com/group16/M00/95ca8932ad974c60a491deb114c5f7e8.jpg","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17127a8c925a225cbe45a27c42d3170c1f1c774bd9a6?imageview/4/0/w/363/h/330/blur/1","ru":22,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2097,"arGame":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":1048888053,"sid":20504185,"ssid":20504185,"name":"鸿涛","desc":"励志民工歌手鸿涛","startTime":1514012470,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/88/1048888053/u10488880535DuAtMT.png","thumb":"http://emyfs.bs2cdn.yy.com/ODRiY2FlMTgtMWFlMC00ZjZkLTkwNjctZDI4Yzg1YWQ2MjJl.jpg?imageview/4/0/w/363/h/330/blur/1","users":32829,"tagStyle":0,"tpl":16777217,"yyNum":44690,"thumb2":"http://emyfs.bs2cdn.yy.com/ODRiY2FlMTgtMWFlMC00ZjZkLTkwNjctZDI4Yzg1YWQ2MjJl.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/ODRiY2FlMTgtMWFlMC00ZjZkLTkwNjctZDI4Yzg1YWQ2MjJl.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17121f08ff602de5bf5eb01e33e2de1366b2a38a18b4?imageview/4/0/w/363/h/330/blur/1","ru":2742,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":919,"arGame":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":1745719208,"sid":13088230,"ssid":13088230,"name":"1900D舞团","desc":"火辣细腰美女舞团","startTime":1514008356,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/71/1745719208/u1745719208U73N6U_.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/NTVlYTI5YWEtOWJlMi00MWEzLWIzMmQtYTQ1YWYzNmJhYTQ0.jpg?imageview/4/0/w/363/h/330/blur/1","users":13452,"tagStyle":0,"tpl":16777217,"yyNum":1996880693,"thumb2":"http://emyfs.bs2cdn.yy.com/NTVlYTI5YWEtOWJlMi00MWEzLWIzMmQtYTQ1YWYzNmJhYTQ0.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/NTVlYTI5YWEtOWJlMi00MWEzLWIzMmQtYTQ1YWYzNmJhYTQ0.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17126cfc6ffc270b29ebbb69b14efe535c336a8610ac?imageview/4/0/w/363/h/330/blur/1","ru":328,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1112,"arGame":0},{"sort":0,"biz":"sport","type":1,"scale":0,"gameStyle":0,"uid":1862825419,"sid":88259216,"ssid":88259216,"name":"翡翠王","desc":"人在边境","startTime":1514011879,"liveTime":3008,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/82/1862825419/u1862825419kLupR5G.jpeg","thumb":"http://mobilelivephoto.bs2dl.yy.com/1862825419_1513495888.832137.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","users":265,"tagStyle":0,"tpl":16777217,"yyNum":2115477166,"thumb2":"http://mobilelivephoto.bs2dl.yy.com/1862825419_1513495888.832137.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","img":"http://mobilelivephoto.bs2dl.yy.com/1862825419_1513495888.832137.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","pid":"15013x03_88259216_1862825419_1514011879_1514011879","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17127ae9cff105660b18d9e9d8febd0ad1b26c637f47?imageview/4/0/w/363/h/330/blur/1","ru":224,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1687,"arGame":0,"site":"德宏傣族景颇族自治州","verify":0,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"red","type":1,"scale":0,"gameStyle":0,"uid":1375747820,"sid":36739922,"ssid":36739922,"name":"罗伟钓鱼","desc":"罗伟中国钓鱼协会","startTime":1514009429,"liveTime":5458,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/74/1375747820/u1375747820pKykmhy.jpg","thumb":"http://emyfs.bs2cdn.yy.com/OGJhYzllMmQtZDdhNC00YWJjLTgzYmItZTBiMjViNmVkODQ0.jpg?imageview/4/3/w/368/h/207/blur/1","users":9364,"tagStyle":0,"tpl":16777217,"yyNum":1524566173,"thumb2":"http://emyfs.bs2cdn.yy.com/OGJhYzllMmQtZDdhNC00YWJjLTgzYmItZTBiMjViNmVkODQ0.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/OGJhYzllMmQtZDdhNC00YWJjLTgzYmItZTBiMjViNmVkODQ0.jpg?imageview/4/0/w/363/h/330/blur/1","pid":"15013x03_36739922_1375747820_1514009429_1513987270","snapshot":"http://screenshot.dwstatic.com/yysnapshot/@composite=ms1_f_MTcxMjY1ZTM3NjEyMzYxMjQ1OTY5NDU1ODgxYzY5YjlhMzRmMDc2ZmJiMjU_f_MTcxMmM3OWZjZjI5ZmQzNGJiZWQ5ZjgzMWE2NWIwMTUxM2Y4OTQ5ODdmYWE?imageview/4/0/w/363/h/330/blur/1","ru":219,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1459,"arGame":0,"site":"遂宁市","verify":3,"totalUser":0,"totalLike":0,"quality":1,"deviceType":4,"groupId":0},{"sort":0,"biz":"talk","type":4,"scale":0,"gameStyle":0,"uid":60977171,"sid":17719117,"ssid":17719117,"name":"夏可可","desc":"百变女神夏可可","startTime":1514008754,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/97/0060977171/u60977171TKB8NVshX.gif","thumb":"http://emyfs.bs2cdn.yy.com/YjU0MzA3YTgtMjMwYS00MzhmLTg3OTQtN2UxMDA1Mjg5ZTk3.jpg?imageview/4/0/w/363/h/330/blur/1","users":21722,"tagStyle":0,"tpl":16777217,"yyNum":18801,"thumb2":"http://emyfs.bs2cdn.yy.com/YjU0MzA3YTgtMjMwYS00MzhmLTg3OTQtN2UxMDA1Mjg5ZTk3.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/YjU0MzA3YTgtMjMwYS00MzhmLTg3OTQtN2UxMDA1Mjg5ZTk3.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712a3f7a7d4dc1ed9fd0a1361ec725a89194ee01c28?imageview/4/0/w/363/h/330/blur/1","ru":1070,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2171,"arGame":0},{"sort":0,"biz":"dance","type":1,"scale":0,"gameStyle":0,"uid":1854225946,"sid":1349205961,"ssid":1349205961,"name":"千古","desc":"大哥支持一下千古妹妹","startTime":1514012331,"liveTime":2556,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/22/1854225946/u1854225946p--E6E-.jpeg","thumb":"http://mobilelivephoto.bs2dl.yy.com/1854225946_1512387008.081916.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","users":447,"tagStyle":0,"tpl":16777217,"yyNum":2106891892,"thumb2":"http://screenshot.dwstatic.com/yysnapshot/1712049f3594cc0a3a3b32a973fb0be2b00a55966d1d?imageview/4/0/w/363/h/330/blur/1","img":"http://screenshot.dwstatic.com/yysnapshot/1712049f3594cc0a3a3b32a973fb0be2b00a55966d1d?imageview/4/0/w/363/h/330/blur/1","pid":"15013x03_1349205961_1854225946_1514012330_1514012330","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712049f3594cc0a3a3b32a973fb0be2b00a55966d1d?imageview/4/0/w/363/h/330/blur/1","ru":0,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2013,"arGame":0,"site":"长沙市","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"red","type":1,"scale":0,"gameStyle":0,"uid":989989098,"sid":91297112,"ssid":91297112,"name":"小东北","desc":"小东北俄语犀利撩妹","startTime":1514011916,"liveTime":2971,"avatar":"http://hp.proxy.yy.duowan.com/get_pic.php?uid=989989098&picid=1&size=full&timestamp=1400184034","thumb":"http://emyfs.bs2cdn.yy.com/Zjg0ODVhYjMtNGMwNy00NzY4LTkwZjMtMTU4OTcxODAxYjg4.jpg?imageview/4/3/w/368/h/207/blur/1","users":2399,"tagStyle":0,"tpl":16777217,"yyNum":956864948,"thumb2":"http://emyfs.bs2cdn.yy.com/Zjg0ODVhYjMtNGMwNy00NzY4LTkwZjMtMTU4OTcxODAxYjg4.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/Zjg0ODVhYjMtNGMwNy00NzY4LTkwZjMtMTU4OTcxODAxYjg4.jpg?imageview/4/0/w/363/h/330/blur/1","pid":"15013x03_91297112_989989098_1514011916_1514008858","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712dc243fd5e75fc2c9ca04c506087ad5c046b83643?imageview/4/0/w/363/h/330/blur/1","ru":912,"linkMic":2,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1285,"arGame":0,"site":"三亚市","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"red","type":1,"scale":0,"gameStyle":0,"uid":1685101232,"sid":1338847589,"ssid":1338847589,"name":"元元姐","desc":"元元姐的美食吃播","startTime":1514001024,"liveTime":13863,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/10/1685101232/u1685101232fBqdm7T.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/OTNjMTg4ZTctNWMxYy00NmIyLWI1ODktNjg2Yjk2YzMyMGUw.jpg?imageview/4/3/w/368/h/207/blur/1","users":737,"tagStyle":0,"tpl":16777217,"yyNum":1919324887,"thumb2":"http://emyfs.bs2cdn.yy.com/OTNjMTg4ZTctNWMxYy00NmIyLWI1ODktNjg2Yjk2YzMyMGUw.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/OTNjMTg4ZTctNWMxYy00NmIyLWI1ODktNjg2Yjk2YzMyMGUw.jpg?imageview/4/0/w/363/h/330/blur/1","pid":"15013x03_1338847589_1685101232_1514001024_1514001024","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712c5556947fe3bccbb8503bea6a126e3467990b1a5?imageview/4/0/w/363/h/330/blur/1","ru":418,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2287,"arGame":0,"site":"长春市","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"mc","type":4,"scale":0,"gameStyle":0,"uid":161576981,"sid":85931665,"ssid":85931665,"name":"白浩","desc":"来YY必须看白浩","startTime":1514002188,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/57/0161576981/u161576981D_UXUASE.png","thumb":"http://emyfs.bs2cdn.yy.com/ZWZmOTQyMTktY2I2ZC00NWYzLWI0N2ItMDgzYTc4MWY5MTZm.jpg?imageview/4/0/w/363/h/330/blur/1","users":18029,"tagStyle":0,"tpl":16777217,"yyNum":855852,"thumb2":"http://emyfs.bs2cdn.yy.com/ZWZmOTQyMTktY2I2ZC00NWYzLWI0N2ItMDgzYTc4MWY5MTZm.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/ZWZmOTQyMTktY2I2ZC00NWYzLWI0N2ItMDgzYTc4MWY5MTZm.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712de8f18858555835f2a985b0b8b167735f28f917e?imageview/4/0/w/363/h/330/blur/1","ru":696,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2314,"arGame":0},{"sort":0,"biz":"talk","type":1,"scale":0,"gameStyle":0,"uid":2177354129,"sid":1349166582,"ssid":1349166582,"name":"飞扬黑玫瑰  战为飞扬","desc":"带我看海不，哈哈哈","startTime":1514006199,"liveTime":8688,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/35/2177354129/u2177354129seRWg-m.jpeg","thumb":"http://mobilelivephoto.bs2dl.yy.com/2177354129_1514006198.259236.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","users":523,"tagStyle":0,"tpl":16777217,"yyNum":2177339894,"thumb2":"http://mobilelivephoto.bs2dl.yy.com/2177354129_1514006198.259236.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","img":"http://mobilelivephoto.bs2dl.yy.com/2177354129_1514006198.259236.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","pid":"15013x03_1349166582_2177354129_1514006199_1514006199","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171259cdf2fb20eb54657f0b45146239d5d2ff397573?imageview/4/0/w/363/h/330/blur/1","ru":0,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1036,"arGame":0,"site":"惠州市","verify":0,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":309564502,"sid":91764588,"ssid":91764588,"name":"夏沫沫丶","desc":"安静的美少女哦~","startTime":1514014553,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/56/0309564502/u309564502gztgoaY-.png","thumb":"https://zonemin.bs2cdn.yy.com/group16/M00/1819/20170624_1844462459356.jpg","users":237,"tagStyle":0,"tpl":16777217,"yyNum":237700344,"thumb2":"https://zonemin.bs2cdn.yy.com/group16/M00/1819/20170624_1844462459356.jpg","img":"https://zonemin.bs2cdn.yy.com/group16/M00/1819/20170624_1844462459356.jpg","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712e82a33980e6a1b78effb2d43968f65348e3edfc6?imageview/4/0/w/363/h/330/blur/1","ru":10,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1460,"arGame":0},{"sort":0,"biz":"other","type":1,"scale":0,"gameStyle":0,"uid":99369695,"sid":34656288,"ssid":34656288,"name":"金色摇篮\u2014\u2014豆","desc":"金色摇篮\u2014\u2014豆","startTime":1514014803,"liveTime":84,"avatar":"http://s5.yy.com/guild/header/10001.jpg","thumb":"http://screenshot.dwstatic.com/yysnapshot/1712306f59a0a810a280e73b833d687b51780b778cd9?imageview/4/3/w/368/h/207/blur/1","users":2,"tagStyle":0,"tpl":16777217,"yyNum":72999152,"thumb2":"http://screenshot.dwstatic.com/yysnapshot/1712306f59a0a810a280e73b833d687b51780b778cd9?imageview/4/0/w/363/h/330/blur/1","img":"http://screenshot.dwstatic.com/yysnapshot/1712306f59a0a810a280e73b833d687b51780b778cd9?imageview/4/0/w/363/h/330/blur/1","pid":"15013x03_34656288_99369695_1514014803_1514014803","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712306f59a0a810a280e73b833d687b51780b778cd9?imageview/4/0/w/363/h/330/blur/1","ru":0,"linkMic":2,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":4607,"arGame":0,"site":"开封市","verify":0,"totalUser":0,"totalLike":0,"quality":1,"deviceType":4,"groupId":0},{"sort":0,"biz":"sing","type":1,"scale":0,"gameStyle":0,"uid":1822510224,"sid":61757747,"ssid":61757747,"name":"S·G 鬼大人","desc":"一库一库","startTime":1514009542,"liveTime":5345,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/51/1822510224/u1822510224wFapLUr.jpeg","thumb":"http://mobilelivephoto.bs2dl.yy.com/1822510224_1511523710.774892.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","users":108,"tagStyle":0,"tpl":16777217,"yyNum":2075116785,"thumb2":"http://mobilelivephoto.bs2dl.yy.com/1822510224_1511523710.774892.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","img":"http://mobilelivephoto.bs2dl.yy.com/1822510224_1511523710.774892.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","pid":"15013x03_61757747_1822510224_1514009541_1514009541","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17123593d9ad08577adbd2b25921e37d1f143283b11e?imageview/4/0/w/363/h/330/blur/1","ru":13,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":894,"arGame":0,"site":"镇江市","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"other","type":1,"scale":0,"gameStyle":0,"uid":1793071844,"sid":1345187408,"ssid":1345187408,"name":"君姐岫岩玉","desc":"随便转转没目标嘿嘿","startTime":1513995639,"liveTime":19248,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/07/1793071844/u1793071844SMF3z1C.jpg","thumb":"http://mobilelivephoto.bs2dl.yy.com/1793071844_1506810991.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","users":230,"tagStyle":0,"tpl":16777217,"yyNum":2045659534,"thumb2":"http://mobilelivephoto.bs2dl.yy.com/1793071844_1506810991.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","img":"http://mobilelivephoto.bs2dl.yy.com/1793071844_1506810991.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","pid":"15013x03_1345187408_1793071844_1513995639_1513995639","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712e24e4f1403138fdcd2efd3a077793d907a597855?imageview/4/0/w/363/h/330/blur/1","ru":12,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1246,"arGame":0,"site":"鞍山市","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"dance","type":1,"scale":0,"gameStyle":0,"uid":1710583018,"sid":17784870,"ssid":17784870,"name":"颖儿","desc":"【天幕】颖儿 ","startTime":1514010113,"liveTime":4774,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/58/1710583018/u17105830182MIlcLl.jpeg","thumb":"http://mobilelivephoto.bs2dl.yy.com/1710583018_1513599338.414216.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","users":94,"tagStyle":0,"tpl":16777217,"yyNum":1952288240,"thumb2":"http://screenshot.dwstatic.com/yysnapshot/17125cc50c56ee688cffab55be4ccfed476c6e4b2610?imageview/4/0/w/363/h/330/blur/1","img":"http://screenshot.dwstatic.com/yysnapshot/17125cc50c56ee688cffab55be4ccfed476c6e4b2610?imageview/4/0/w/363/h/330/blur/1","pid":"15013x03_17784870_1710583018_1514010112_1514010112","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17125cc50c56ee688cffab55be4ccfed476c6e4b2610?imageview/4/0/w/363/h/330/blur/1","ru":9,"linkMic":2,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":5569,"arGame":0,"site":"上海市","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"other","type":1,"scale":0,"gameStyle":0,"uid":1843803126,"sid":1348422716,"ssid":1348422716,"name":"万佛巷大小金刚一手货源批发零售","desc":"老许万佛巷佛珠拍卖直播中","startTime":1514001856,"liveTime":13031,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/80/1843803126/u1843803126mRENK0X.jpeg","thumb":"http://mobilelivephoto.bs2dl.yy.com/1843803126_1511937321.764946.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","users":1886,"tagStyle":0,"tpl":16777217,"yyNum":2096421978,"thumb2":"http://mobilelivephoto.bs2dl.yy.com/1843803126_1511937321.764946.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","img":"http://mobilelivephoto.bs2dl.yy.com/1843803126_1511937321.764946.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","pid":"15013x03_1348422716_1843803126_1514001856_1514001856","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171277b8628b3bf3c5a9dd280aa6820c1dbb3f3ad98b?imageview/4/0/w/363/h/330/blur/1","ru":10,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2924,"arGame":0,"site":"淄博市","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"other","type":4,"scale":0,"gameStyle":0,"uid":2192490045,"sid":17757078,"ssid":17757078,"name":"傲龙合击-糖糖","desc":"傲龙合击","startTime":1513987758,"liveTime":0,"avatar":"http://s5.yy.com/guild/header/10001.jpg","thumb":"http://screenshot.dwstatic.com/yysnapshot/171260c3c70b5c7e9d29d3a60fc60d5c511ca9b5020b?imageview/4/0/w/363/h/330/blur/1","users":394,"tagStyle":0,"tpl":16777217,"yyNum":2192727121,"thumb2":"http://screenshot.dwstatic.com/yysnapshot/171260c3c70b5c7e9d29d3a60fc60d5c511ca9b5020b?imageview/4/0/w/363/h/330/blur/1","img":"http://screenshot.dwstatic.com/yysnapshot/171260c3c70b5c7e9d29d3a60fc60d5c511ca9b5020b?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171260c3c70b5c7e9d29d3a60fc60d5c511ca9b5020b?imageview/4/0/w/363/h/330/blur/1","ru":19,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":7676,"arGame":0},{"sort":0,"biz":"red","type":4,"scale":0,"gameStyle":0,"uid":1258671196,"sid":52249586,"ssid":52249586,"name":"麦子龙","desc":"感谢遇到你们","startTime":1514008890,"liveTime":0,"avatar":"http://downlogo1.yy.duowan.com/user_logo/96/11/67/1258671196/f8ab94152c54446aa4e6fd9db9a6f199.png","thumb":"http://emyfs.bs2cdn.yy.com/NWNmNjQ1M2UtM2VlZS00NzJmLWJiYmUtMWI3N2M5OTUyNzcw.jpg?imageview/4/0/w/363/h/330/blur/1","users":11142,"tagStyle":0,"tpl":16777217,"yyNum":1374813358,"thumb2":"http://emyfs.bs2cdn.yy.com/NWNmNjQ1M2UtM2VlZS00NzJmLWJiYmUtMWI3N2M5OTUyNzcw.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/NWNmNjQ1M2UtM2VlZS00NzJmLWJiYmUtMWI3N2M5OTUyNzcw.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712772e17c876aa971acf2fe2b808b1bfe4062a1e74?imageview/4/0/w/363/h/330/blur/1","ru":248,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1391,"arGame":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":450033088,"sid":18705210,"ssid":18705210,"name":"鱼baby","desc":"韩范小妖精鱼baby","startTime":1514006955,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/03/0450033088/u450033088UyPuRDr7.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/MjRiYmVkODQtYTcxOC00MDA4LWFmNTEtYzM2ZTRhZThhNzU1.jpg?imageview/4/0/w/363/h/330/blur/1","users":1302,"tagStyle":0,"tpl":16777217,"yyNum":369178190,"thumb2":"http://emyfs.bs2cdn.yy.com/MjRiYmVkODQtYTcxOC00MDA4LWFmNTEtYzM2ZTRhZThhNzU1.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/MjRiYmVkODQtYTcxOC00MDA4LWFmNTEtYzM2ZTRhZThhNzU1.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171225a2f58efbc3ba4810e2c7485084ddab7caa7218?imageview/4/0/w/363/h/330/blur/1","ru":197,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1787,"arGame":0},{"sort":0,"biz":"talk","type":4,"scale":0,"gameStyle":0,"uid":1769987365,"sid":65319370,"ssid":65319370,"name":"乐乐乐","desc":"新主播求关注求守护","startTime":1514013672,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/98/1769987365/u1769987365h70rc9W.jpg","thumb":"https://zonemin.bs2cdn.yy.com/group16/M00/6279333656ee446189da02a6c1e572c5.jpg","users":32,"tag":"公会推荐","tagStyle":1,"tpl":16777217,"yyNum":2022574525,"thumb2":"https://zonemin.bs2cdn.yy.com/group16/M00/6279333656ee446189da02a6c1e572c5.jpg","img":"https://zonemin.bs2cdn.yy.com/group16/M00/6279333656ee446189da02a6c1e572c5.jpg","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17120dfed25e80c8c024ab0ac961abb9d25176f70bf0?imageview/4/0/w/363/h/330/blur/1","ru":6,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1089,"arGame":0},{"sort":0,"biz":"mc","type":4,"scale":0,"gameStyle":0,"uid":1855002740,"sid":1349263415,"ssid":1349263415,"name":"长鑫✦阿振小熊   只要气球！","desc":"开心就好！~找 场控.","startTime":1514010365,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/00/1855002740/u1855002740EbTm3GP.jpg","thumb":"http://screenshot.dwstatic.com/yysnapshot/1712f5f20dde78d6b28bb6f94552be3110b25aac3afb?imageview/4/0/w/363/h/330/blur/1","users":126,"tag":"公会推荐","tagStyle":1,"tpl":16777217,"yyNum":2107643222,"thumb2":"http://screenshot.dwstatic.com/yysnapshot/1712f5f20dde78d6b28bb6f94552be3110b25aac3afb?imageview/4/0/w/363/h/330/blur/1","img":"http://screenshot.dwstatic.com/yysnapshot/1712f5f20dde78d6b28bb6f94552be3110b25aac3afb?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712f5f20dde78d6b28bb6f94552be3110b25aac3afb?imageview/4/0/w/363/h/330/blur/1","ru":6,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1860,"arGame":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":1724945532,"sid":36949110,"ssid":36949110,"name":"帝龍","desc":"家里等你们！~~","startTime":1514009137,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/94/1724945532/u1724945532r0LVLP0.png","thumb":"https://zonemin.bs2cdn.yy.com/group16/M00/8737f7b0781645c89e78b9c7b6f84ac2.jpg","users":223,"tag":"公会推荐","tagStyle":1,"tpl":16777217,"yyNum":1970678885,"thumb2":"https://zonemin.bs2cdn.yy.com/group16/M00/8737f7b0781645c89e78b9c7b6f84ac2.jpg","img":"https://zonemin.bs2cdn.yy.com/group16/M00/8737f7b0781645c89e78b9c7b6f84ac2.jpg","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171251ed14573f765409f063066b6133870b99fc6ff9?imageview/4/0/w/363/h/330/blur/1","ru":0,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1362,"arGame":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":1374794382,"sid":24653123,"ssid":24653123,"name":"重庆馨馨","desc":"重庆妹子等你来","startTime":1514008874,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/79/1374794382/u1374794382wnJO3kc.jpg","thumb":"https://zonemin.bs2cdn.yy.com/group16/M00/b5ef44a30267431eb21342ca323bd16d.jpg","users":536,"tag":"公会推荐","tagStyle":1,"tpl":16777217,"yyNum":1523521315,"thumb2":"https://zonemin.bs2cdn.yy.com/group16/M00/b5ef44a30267431eb21342ca323bd16d.jpg","img":"https://zonemin.bs2cdn.yy.com/group16/M00/b5ef44a30267431eb21342ca323bd16d.jpg","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171291f27413db1a7758d7e65aded9508a94acfccf59?imageview/4/0/w/363/h/330/blur/1","ru":11,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1220,"arGame":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":1076255692,"sid":27737189,"ssid":27737189,"name":"雀跃小葫芦","desc":"百变热舞女神小葫芦","startTime":1514013755,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/25/1076255692/u10762556922fG17NH.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/NWRmYjk2MDEtMzhiMy00YzE4LTk2MjAtMmE5Nzg0MTgwZmRl.jpg?imageview/4/0/w/363/h/330/blur/1","users":10691,"tagStyle":0,"tpl":16777217,"yyNum":1142949523,"thumb2":"http://emyfs.bs2cdn.yy.com/NWRmYjk2MDEtMzhiMy00YzE4LTk2MjAtMmE5Nzg0MTgwZmRl.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/NWRmYjk2MDEtMzhiMy00YzE4LTk2MjAtMmE5Nzg0MTgwZmRl.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712843b6e8920ae80167cebf18b43624b75077a3b34?imageview/4/0/w/363/h/330/blur/1","ru":99,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1654,"arGame":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":1518790387,"sid":98223994,"ssid":98223994,"name":"芮宝","desc":"热辣身材航母芮宝","startTime":1514013533,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/79/1518790387/u1518790387oIUkPuX.png","thumb":"http://emyfs.bs2cdn.yy.com/ODc0NDZjNGItYzcwMC00ZTRjLTg5OWYtYmIxZWViNTVlN2Yy.jpg?imageview/4/0/w/363/h/330/blur/1","users":9598,"tagStyle":0,"tpl":16777217,"yyNum":1647313,"thumb2":"http://emyfs.bs2cdn.yy.com/ODc0NDZjNGItYzcwMC00ZTRjLTg5OWYtYmIxZWViNTVlN2Yy.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/ODc0NDZjNGItYzcwMC00ZTRjLTg5OWYtYmIxZWViNTVlN2Yy.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17123bfc15733612d8a5494376df18edc589b22895c3?imageview/4/0/w/363/h/330/blur/1","ru":448,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1702,"arGame":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":1710023455,"sid":70914582,"ssid":70914582,"name":"燃舞蹈-朵教主","desc":"舞蹈小妖精朵教主","startTime":1514005887,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/02/1710023455/u1710023455EaXpIvE.jpg","thumb":"http://emyfs.bs2cdn.yy.com/MTFmZjBjYmQtYmMyYS00MDBkLWJkZmMtOWFmMGQ4ZjI3YTVm.jpg?imageview/4/0/w/363/h/330/blur/1","users":30,"tagStyle":0,"tpl":16777217,"yyNum":1951634869,"thumb2":"http://emyfs.bs2cdn.yy.com/MTFmZjBjYmQtYmMyYS00MDBkLWJkZmMtOWFmMGQ4ZjI3YTVm.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/MTFmZjBjYmQtYmMyYS00MDBkLWJkZmMtOWFmMGQ4ZjI3YTVm.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712348924a914e905562412f35c395ed44792f81e39?imageview/4/0/w/363/h/330/blur/1","ru":27,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2172,"arGame":0},{"sort":0,"biz":"mc","type":4,"scale":0,"gameStyle":0,"uid":1848196298,"sid":1348936742,"ssid":1348936742,"name":"柔小宝","desc":"逗比女麦柔小宝","startTime":1514009534,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/19/1848196298/u1848196298cW-kzev.png","thumb":"http://emyfs.bs2cdn.yy.com/MGVjOGJkZGUtYTgyNS00NzA1LTljMDAtMDRlODg3ZmMyZjhm.jpg?imageview/4/0/w/363/h/330/blur/1","users":1210,"tagStyle":0,"tpl":16777217,"yyNum":2100834303,"thumb2":"http://emyfs.bs2cdn.yy.com/MGVjOGJkZGUtYTgyNS00NzA1LTljMDAtMDRlODg3ZmMyZjhm.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/MGVjOGJkZGUtYTgyNS00NzA1LTljMDAtMDRlODg3ZmMyZjhm.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17120f08d10914608bec9b09013bcbc36a443508cace?imageview/4/0/w/363/h/330/blur/1","ru":162,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1349,"arGame":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":103253596,"sid":26030043,"ssid":26030043,"name":"易公子","desc":"磁性好声音易公子","startTime":1514014214,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/25/0103253596/u103253596qcgk8PZt.jpg","thumb":"http://emyfs.bs2cdn.yy.com/NWE0ZDgzN2UtYmMyNS00NGZiLWIyNGEtYTM2NGU1YmM5Yjg1.jpg?imageview/4/0/w/363/h/330/blur/1","users":4539,"tagStyle":0,"tpl":16777217,"yyNum":78561041,"thumb2":"http://emyfs.bs2cdn.yy.com/NWE0ZDgzN2UtYmMyNS00NGZiLWIyNGEtYTM2NGU1YmM5Yjg1.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/NWE0ZDgzN2UtYmMyNS00NGZiLWIyNGEtYTM2NGU1YmM5Yjg1.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17122a4654a1c04165c6a12c69f5935c3b245fe03b5b?imageview/4/0/w/363/h/330/blur/1","ru":57,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1597,"arGame":0},{"sort":0,"biz":"pet","type":1,"scale":0,"gameStyle":0,"uid":2188737843,"sid":1349631212,"ssid":1349631212,"name":"叮叮","desc":"爱我还是它","startTime":1514012466,"liveTime":2421,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/73/2188737843/u2188737843LQgWSvR.jpeg","thumb":"http://mobilelivephoto.bs2dl.yy.com/2188737843_1513494150.369908.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","users":14992,"tagStyle":0,"tpl":16777217,"yyNum":2189178074,"thumb2":"http://mobilelivephoto.bs2dl.yy.com/2188737843_1513494150.369908.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","img":"http://mobilelivephoto.bs2dl.yy.com/2188737843_1513494150.369908.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","pid":"15013x03_1349631212_2188737843_1514012466_1514012466","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712d44aa2a1710a6ef31c869dcfa3224811859e6eea?imageview/4/0/w/363/h/330/blur/1","ru":7,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1005,"arGame":0,"site":"温州市","verify":0,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"red","type":4,"scale":0,"gameStyle":0,"uid":233524989,"sid":61795155,"ssid":61795155,"name":"山哥飞行人","desc":"山哥 户外航模飞行","startTime":1514008816,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/52/0233524989/u233524989Se9XhaMx.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/NDVhYTU0MjAtMDM1NS00NGU0LWFmN2MtYmYwODQxNThhZjMy.jpg?imageview/4/0/w/363/h/330/blur/1","users":972,"tagStyle":0,"tpl":16777217,"yyNum":220729047,"thumb2":"http://emyfs.bs2cdn.yy.com/NDVhYTU0MjAtMDM1NS00NGU0LWFmN2MtYmYwODQxNThhZjMy.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/NDVhYTU0MjAtMDM1NS00NGU0LWFmN2MtYmYwODQxNThhZjMy.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712973b4917e5952538a6a84f5fab8cf34562f9aa32?imageview/4/0/w/363/h/330/blur/1","ru":19,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2587,"arGame":0},{"sort":0,"biz":"car","type":4,"scale":0,"gameStyle":0,"uid":1328258303,"sid":92828986,"ssid":92828986,"name":"夏洛沙画","desc":"美女沙画浪漫制造","startTime":1514008919,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/25/1328258303/u1328258303FgfgS5j.png","thumb":"http://emyfs.bs2cdn.yy.com/NGQ0OTQwODYtNzRkMi00MGFjLTljNTgtNmQ4ZTNjYjExZWE0.jpg?imageview/4/0/w/363/h/330/blur/1","users":3088,"tagStyle":0,"tpl":16777217,"yyNum":1463662365,"thumb2":"http://emyfs.bs2cdn.yy.com/NGQ0OTQwODYtNzRkMi00MGFjLTljNTgtNmQ4ZTNjYjExZWE0.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/NGQ0OTQwODYtNzRkMi00MGFjLTljNTgtNmQ4ZTNjYjExZWE0.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712aa6854cbcd0c16bf3c5848f88cfa99471d9918a7?imageview/4/0/w/363/h/330/blur/1","ru":21,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1090,"arGame":0},{"sort":0,"biz":"talk","type":1,"scale":0,"gameStyle":0,"uid":1741267606,"sid":57528595,"ssid":57528595,"name":"伊6","desc":"安徽合肥妹子","startTime":1514014788,"liveTime":99,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/26/1741267606/u1741267606SZF5GH4.jpeg","thumb":"http://mobilelivephoto.bs2dl.yy.com/1741267606_1513911921.275244.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","users":11,"tagStyle":0,"tpl":16777217,"yyNum":1991362052,"thumb2":"http://mobilelivephoto.bs2dl.yy.com/1741267606_1513911921.275244.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","img":"http://mobilelivephoto.bs2dl.yy.com/1741267606_1513911921.275244.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","pid":"15013x03_57528595_1741267606_1514014788_1514014788","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17123facc1bbcecf88a3111333f9fd5be5e686382104?imageview/4/0/w/363/h/330/blur/1","ru":0,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1317,"arGame":0,"site":"合肥市","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":1847728531,"sid":63200376,"ssid":63200376,"name":"小小软","desc":"软香美人舞艺高","startTime":1514005383,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/72/1847728531/u1847728531XeT7Tc_.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/OTM1MTFmYTYtZTZmZC00Yjg0LWEwYmUtMWIyYjUwMzY5Yjdl.jpg?imageview/4/0/w/363/h/330/blur/1","users":35,"tagStyle":0,"tpl":16777217,"yyNum":2100334537,"thumb2":"http://emyfs.bs2cdn.yy.com/OTM1MTFmYTYtZTZmZC00Yjg0LWEwYmUtMWIyYjUwMzY5Yjdl.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/OTM1MTFmYTYtZTZmZC00Yjg0LWEwYmUtMWIyYjUwMzY5Yjdl.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17128f3fc295d3a9b54eeca269c0da720c951062591a?imageview/4/0/w/363/h/330/blur/1","ru":31,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":799,"arGame":0},{"sort":0,"biz":"sport","type":4,"scale":0,"gameStyle":0,"uid":783678447,"sid":60626512,"ssid":60626512,"name":"wwe浅笑","desc":"摔跤狂魔浅笑","startTime":1514012410,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/67/0783678447/u783678447IKO-whfv.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/MDdiNWE2NjktNmJjYi00YmQwLWI4NDYtZWIyNjJmNGY4ODhm.jpg?imageview/4/0/w/363/h/330/blur/1","users":123034,"tag":"46热血搏击","tagStyle":1,"tpl":16777217,"yyNum":739908660,"thumb2":"http://emyfs.bs2cdn.yy.com/MDdiNWE2NjktNmJjYi00YmQwLWI4NDYtZWIyNjJmNGY4ODhm.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/MDdiNWE2NjktNmJjYi00YmQwLWI4NDYtZWIyNjJmNGY4ODhm.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171264fb2c23dd936a148427dd7a8b8433d48a97ece4?imageview/4/0/w/363/h/330/blur/1","ru":257,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2235,"logo":"http://emyfs.bs2cdn.yy.com/NGU2MTM2MjUtN2JiNi00OTMwLWEzMDctMTM3OTc4MTJhM2Qz.png","arGame":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":1572765545,"sid":72656017,"ssid":72656017,"name":"默默有文","desc":"俏皮唱将默默","startTime":1514009791,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/76/1572765545/u1572765545T2YCBPT.jpg","thumb":"http://emyfs.bs2cdn.yy.com/ZTVhNTY0ZTItMDJkMy00OGVkLWIzZmEtNDBjNWIwNjBhMjE4.jpg?imageview/4/0/w/363/h/330/blur/1","users":5435,"tagStyle":0,"tpl":16777217,"yyNum":1774663357,"thumb2":"http://emyfs.bs2cdn.yy.com/ZTVhNTY0ZTItMDJkMy00OGVkLWIzZmEtNDBjNWIwNjBhMjE4.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/ZTVhNTY0ZTItMDJkMy00OGVkLWIzZmEtNDBjNWIwNjBhMjE4.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17128633312a8180b162a9808a3724ccd19cffdfc95b?imageview/4/0/w/363/h/330/blur/1","ru":285,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":802,"arGame":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":1796013143,"sid":79948204,"ssid":79948204,"name":"雅心","desc":"重庆小仙女雅心","startTime":1514012475,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/01/1796013143/u1796013143w6vzYND.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/MTgwMTQ2OTEtODQ3YS00MmVkLWExOGEtMDVlZjI2NTk5MzAz.jpg?imageview/4/0/w/363/h/330/blur/1","users":1818,"tagStyle":0,"tpl":16777217,"yyNum":2048619708,"thumb2":"http://emyfs.bs2cdn.yy.com/MTgwMTQ2OTEtODQ3YS00MmVkLWExOGEtMDVlZjI2NTk5MzAz.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/MTgwMTQ2OTEtODQ3YS00MmVkLWExOGEtMDVlZjI2NTk5MzAz.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712b2c8cbaff7fa86989dd06c96706c5709816d6346?imageview/4/0/w/363/h/330/blur/1","ru":24,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2333,"arGame":0},{"sort":0,"biz":"car","type":4,"scale":0,"gameStyle":0,"uid":1761092973,"sid":21516497,"ssid":2106801740,"name":"跨越次元-翊歌","desc":"惊艳伪声，不敢相信性别！","startTime":1514010863,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/09/1761092973/u1761092973THF5tz-.png","thumb":"http://emyfs.bs2cdn.yy.com/NjE2YTQ1OTItNjRlOS00MTg0LWE5YzktYzlkMmUyZGQ3MTVk.jpg?imageview/4/0/w/363/h/330/blur/1","users":226,"tag":"YY星探","tagStyle":1,"tpl":16777217,"yyNum":2013700448,"thumb2":"http://emyfs.bs2cdn.yy.com/NjE2YTQ1OTItNjRlOS00MTg0LWE5YzktYzlkMmUyZGQ3MTVk.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/NjE2YTQ1OTItNjRlOS00MTg0LWE5YzktYzlkMmUyZGQ3MTVk.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712d786110b23bf6cc5f556e1ee914f614a7d6eb3cd?imageview/4/0/w/363/h/330/blur/1","ru":0,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":3482,"arGame":0},{"sort":0,"biz":"car","type":1,"scale":0,"gameStyle":0,"uid":9718655,"sid":37775687,"ssid":37775687,"name":"中国蓝の影露 感谢我的家人们感谢有你们","desc":"二次元甜美小污女","startTime":1514013104,"liveTime":1783,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/71/0009718655/u9718655Mm2jTUuqgW.png","thumb":"http://emyfs.bs2cdn.yy.com/YTUzODk0ZDctNWVlNC00MjQzLWEyZGItMGU4M2Y0ZjM0ODFi.jpg?imageview/4/3/w/368/h/207/blur/1","users":1189,"tagStyle":0,"tpl":16777217,"yyNum":4058263,"thumb2":"http://emyfs.bs2cdn.yy.com/YTUzODk0ZDctNWVlNC00MjQzLWEyZGItMGU4M2Y0ZjM0ODFi.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/YTUzODk0ZDctNWVlNC00MjQzLWEyZGItMGU4M2Y0ZjM0ODFi.jpg?imageview/4/0/w/363/h/330/blur/1","pid":"15013x03_37775687_9718655_1514013104_1514013104","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171251f7b01413d1dd659565b8b2bef96eb041d2ea97?imageview/4/0/w/363/h/330/blur/1","ru":18,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1339,"arGame":0,"site":"佛山市","verify":3,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":895381097,"sid":77601370,"ssid":77601370,"name":"楚小楚","desc":"颜值担当楚小楚","startTime":1514010238,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/38/0895381097/u8953810976r4wMhOD.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/Y2JhNTFhODAtNGUwZi00OTE5LTk1Y2QtYmNhM2U5Mjk3MWE1.jpg?imageview/4/0/w/363/h/330/blur/1","users":11549,"tagStyle":0,"tpl":16777217,"yyNum":858388881,"thumb2":"http://emyfs.bs2cdn.yy.com/Y2JhNTFhODAtNGUwZi00OTE5LTk1Y2QtYmNhM2U5Mjk3MWE1.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/Y2JhNTFhODAtNGUwZi00OTE5LTk1Y2QtYmNhM2U5Mjk3MWE1.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17122a7213c9047d5ec89a747b7f2746d18738c6af01?imageview/4/0/w/363/h/330/blur/1","ru":186,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":972,"arGame":0},{"sort":0,"biz":"talk","type":1,"scale":0,"gameStyle":0,"uid":1493831301,"sid":1345378165,"ssid":1345378165,"name":"舞帝小怪兽","desc":"主播距离你4.36km","startTime":1514012257,"liveTime":2630,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/83/1493831301/u1493831301Fn7PuAJ.jpg","thumb":"http://mobilelivephoto.bs2dl.yy.com/1493831301_1512024971.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","users":544,"tagStyle":0,"tpl":16777217,"yyNum":1674134274,"thumb2":"http://mobilelivephoto.bs2dl.yy.com/1493831301_1512024971.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","img":"http://mobilelivephoto.bs2dl.yy.com/1493831301_1512024971.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","pid":"15013x03_1345378165_1493831301_1514012257_1514012257","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17126f6b36c88be4a34732b9499104450a656c7b8787?imageview/4/0/w/363/h/330/blur/1","ru":11,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":2917,"arGame":0,"site":"镇江市","verify":3,"totalUser":0,"totalLike":0,"quality":1,"deviceType":4,"groupId":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":1483162680,"sid":15347448,"ssid":15347448,"name":"鱼儿","desc":"清新性感女神小萌鱼","startTime":1514003121,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/16/1483162680/u1483162680n6TT2HQ.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/YzlkODhmY2UtODQ0OC00ZDIwLWIyYTUtNjNhNDQxNjNiYmJj.jpg?imageview/4/0/w/363/h/330/blur/1","users":1024,"tagStyle":0,"tpl":16777217,"yyNum":1660560023,"thumb2":"http://emyfs.bs2cdn.yy.com/YzlkODhmY2UtODQ0OC00ZDIwLWIyYTUtNjNhNDQxNjNiYmJj.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/YzlkODhmY2UtODQ0OC00ZDIwLWIyYTUtNjNhNDQxNjNiYmJj.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712f283e605123c2ff2dd256d21762218309ef82bf9?imageview/4/0/w/363/h/330/blur/1","ru":33,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":635,"arGame":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":1600664545,"sid":65838337,"ssid":65838337,"name":"通灵儿","desc":"性感舞姿灵儿","startTime":1514003961,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/66/1600664545/u1600664545FyAP8th.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/ZDI5NmQ5YmItODU1MS00M2MwLTg0YzAtZTZjMWY4M2RlYTlh.jpg?imageview/4/0/w/363/h/330/blur/1","users":3142,"tagStyle":0,"tpl":16777217,"yyNum":1810836459,"thumb2":"http://emyfs.bs2cdn.yy.com/ZDI5NmQ5YmItODU1MS00M2MwLTg0YzAtZTZjMWY4M2RlYTlh.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/ZDI5NmQ5YmItODU1MS00M2MwLTg0YzAtZTZjMWY4M2RlYTlh.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712e4090ce7f061d72ad071242717dceb3712111c67?imageview/4/0/w/363/h/330/blur/1","ru":26,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1630,"arGame":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":1338947049,"sid":67696105,"ssid":67696105,"name":"7038琪琪","desc":"惹火舞姬一字马琪琪","startTime":1514006124,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/94/1338947049/u1338947049T7cw2uK.png","thumb":"http://emyfs.bs2cdn.yy.com/ZDcyZGMzNDMtYWVkYS00ZWQwLTliYmMtNTIwN2ZlMGMxYTFm.jpg?imageview/4/0/w/363/h/330/blur/1","users":2683,"tagStyle":0,"tpl":16777217,"yyNum":1476775623,"thumb2":"http://emyfs.bs2cdn.yy.com/ZDcyZGMzNDMtYWVkYS00ZWQwLTliYmMtNTIwN2ZlMGMxYTFm.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/ZDcyZGMzNDMtYWVkYS00ZWQwLTliYmMtNTIwN2ZlMGMxYTFm.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171226692ac6b0d6203f8898fd5fa52f70072556876e?imageview/4/0/w/363/h/330/blur/1","ru":125,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":569,"arGame":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":153532969,"sid":90890087,"ssid":90890087,"name":"艾米8426","desc":"我有首情歌想唱给你听","startTime":1514013289,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/53/0153532969/u153532969vxzrmFWD.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/Njg2NmU2YzgtMDFhMS00ZjE1LThlZjAtYjk1YmI4MWJmN2Qz.jpg?imageview/4/0/w/363/h/330/blur/1","users":3341,"tagStyle":0,"tpl":16777217,"yyNum":140629366,"thumb2":"http://emyfs.bs2cdn.yy.com/Njg2NmU2YzgtMDFhMS00ZjE1LThlZjAtYjk1YmI4MWJmN2Qz.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/Njg2NmU2YzgtMDFhMS00ZjE1LThlZjAtYjk1YmI4MWJmN2Qz.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171288433a8588ebcd5bc71c72ddbf6d876da27a55f2?imageview/4/0/w/363/h/330/blur/1","ru":48,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1440,"arGame":0},{"sort":0,"biz":"sport","type":4,"scale":0,"gameStyle":0,"uid":1843490285,"sid":1348373695,"ssid":1348373695,"name":"雪儿","desc":"白茹雪","startTime":1514011076,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/49/1843490285/u1843490285aziSzWN.jpeg","thumb":"http://screenshot.dwstatic.com/yysnapshot/1712a4b6fa656999e9fed1dbb93fbebec58bc77fe8f5?imageview/4/0/w/363/h/330/blur/1","users":1248,"tagStyle":0,"tpl":16777217,"yyNum":2096139561,"thumb2":"http://screenshot.dwstatic.com/yysnapshot/1712a4b6fa656999e9fed1dbb93fbebec58bc77fe8f5?imageview/4/0/w/363/h/330/blur/1","img":"http://screenshot.dwstatic.com/yysnapshot/1712a4b6fa656999e9fed1dbb93fbebec58bc77fe8f5?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712a4b6fa656999e9fed1dbb93fbebec58bc77fe8f5?imageview/4/0/w/363/h/330/blur/1","ru":27,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1330,"arGame":0},{"sort":0,"biz":"sing","type":4,"scale":0,"gameStyle":0,"uid":1337339535,"sid":66336516,"ssid":66336516,"name":"丫宝","desc":"软萌甜妹小丫宝","startTime":1514012262,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/33/1337339535/u1337339535nfxNN0l.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/YjA4NTI1NWQtNjg1My00OTYwLTgyY2MtZWYzNTJkMThhM2I0.jpg?imageview/4/0/w/363/h/330/blur/1","users":958,"tagStyle":0,"tpl":16777217,"yyNum":1475006327,"thumb2":"http://emyfs.bs2cdn.yy.com/YjA4NTI1NWQtNjg1My00OTYwLTgyY2MtZWYzNTJkMThhM2I0.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/YjA4NTI1NWQtNjg1My00OTYwLTgyY2MtZWYzNTJkMThhM2I0.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712d8a1b03e07c6dc969380d63feaa1f686bb34b314?imageview/4/0/w/363/h/330/blur/1","ru":17,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1564,"arGame":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":1727854143,"sid":1342018754,"ssid":1342018754,"name":"苏丽珍","desc":"妖艳性感苏丽珍","startTime":1514014157,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/85/1727854143/u1727854143XvL6t-E.jpeg","thumb":"http://emyfs.bs2cdn.yy.com/NThlODE2NjctMTcyZC00NTA5LWIzNWItN2E3M2RhNmE3N2Mz.jpg?imageview/4/0/w/363/h/330/blur/1","users":1057,"tagStyle":0,"tpl":16777217,"yyNum":1973923981,"thumb2":"http://emyfs.bs2cdn.yy.com/NThlODE2NjctMTcyZC00NTA5LWIzNWItN2E3M2RhNmE3N2Mz.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/NThlODE2NjctMTcyZC00NTA5LWIzNWItN2E3M2RhNmE3N2Mz.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171218f2bbac40f721bca2378601da6be68a7c833751?imageview/4/0/w/363/h/330/blur/1","ru":18,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1393,"arGame":0},{"sort":0,"biz":"talk","type":1,"scale":0,"gameStyle":0,"uid":1678228676,"sid":1338557780,"ssid":1338557780,"name":"穆穆翡翠","desc":"穆穆翡翠正在直播","startTime":1514013898,"liveTime":989,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/22/1678228676/u16782286769LU073s.jpeg","thumb":"http://mobilelivephoto.bs2dl.yy.com/1678228676_1513929295.081821.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","users":141,"tagStyle":0,"tpl":16777217,"yyNum":1909920420,"thumb2":"http://mobilelivephoto.bs2dl.yy.com/1678228676_1513929295.081821.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","img":"http://mobilelivephoto.bs2dl.yy.com/1678228676_1513929295.081821.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","pid":"15013x03_1338557780_1678228676_1514013898_1514013898","snapshot":"http://screenshot.dwstatic.com/yysnapshot/171233bc078919566e55a73228a8e0c75f76e8cad656?imageview/4/0/w/363/h/330/blur/1","ru":0,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":568,"arGame":0,"site":"德宏傣族景颇族自治州","verify":0,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"dance","type":4,"scale":0,"gameStyle":0,"uid":1706184961,"sid":35977576,"ssid":35977576,"name":"美羊羊","desc":"魅惑舞娘美洋洋","startTime":1514010703,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/18/1706184961/u1706184961qGMflvW.jpg","thumb":"http://emyfs.bs2cdn.yy.com/N2Y0ZTRhMGQtZTJmNS00Yzc1LWIwZDgtNzQ1NzhmODZlZmQ2.jpg?imageview/4/0/w/363/h/330/blur/1","users":8630,"tagStyle":0,"tpl":16777217,"yyNum":1946969664,"thumb2":"http://emyfs.bs2cdn.yy.com/N2Y0ZTRhMGQtZTJmNS00Yzc1LWIwZDgtNzQ1NzhmODZlZmQ2.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/N2Y0ZTRhMGQtZTJmNS00Yzc1LWIwZDgtNzQ1NzhmODZlZmQ2.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17128ca7560680d1b9d144c684b2e2bd114c3396c893?imageview/4/0/w/363/h/330/blur/1","ru":52,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":575,"arGame":0},{"sort":0,"biz":"other","type":1,"scale":0,"gameStyle":0,"uid":1860332743,"sid":1349533491,"ssid":1349533491,"name":"维娜珠宝","desc":"缅甸翡翠","startTime":1513993997,"liveTime":20890,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/33/1860332743/u1860332743oEyBIfY.jpg","thumb":"http://mobilelivephoto.bs2dl.yy.com/1860332743_1513326281.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","users":1,"tagStyle":0,"tpl":16777217,"yyNum":2112990446,"thumb2":"http://mobilelivephoto.bs2dl.yy.com/1860332743_1513326281.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","img":"http://mobilelivephoto.bs2dl.yy.com/1860332743_1513326281.jpg?ips_thumbnail/3/w/363/h/330/format=jpeg","pid":"15013x03_1349533491_1860332743_1513993997_1513993997","snapshot":"http://screenshot.dwstatic.com/yysnapshot/1712870b76f1e50ac33f36fd01a60f87df613d651db3?imageview/4/0/w/363/h/330/blur/1","ru":0,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":1413,"arGame":0,"site":"德宏傣族景颇族自治州","verify":0,"totalUser":0,"totalLike":0,"quality":2,"deviceType":4,"groupId":0},{"sort":0,"biz":"mc","type":4,"scale":0,"gameStyle":0,"uid":90105598,"sid":12881334,"ssid":12881334,"name":"dj宝儿","desc":"性感广西女DJ","startTime":1514009573,"liveTime":0,"avatar":"http://downhdlogo.yy.com/hdlogo/6060/60/60/10/0090105598/u90105598F8ZcYVOvy.png","thumb":"http://emyfs.bs2cdn.yy.com/ZjcyMWFkMDItZmFmMS00Nzk1LWJhMjItYmQwZmU4NzFlMzlh.jpg?imageview/4/0/w/363/h/330/blur/1","users":4854,"tagStyle":0,"tpl":16777217,"yyNum":43540694,"thumb2":"http://emyfs.bs2cdn.yy.com/ZjcyMWFkMDItZmFmMS00Nzk1LWJhMjItYmQwZmU4NzFlMzlh.jpg?imageview/4/0/w/363/h/330/blur/1","img":"http://emyfs.bs2cdn.yy.com/ZjcyMWFkMDItZmFmMS00Nzk1LWJhMjItYmQwZmU4NzFlMzlh.jpg?imageview/4/0/w/363/h/330/blur/1","snapshot":"http://screenshot.dwstatic.com/yysnapshot/17120562a8e6df3f051fef8a74d140c526808d43211a?imageview/4/0/w/363/h/330/blur/1","ru":65,"linkMic":0,"token":"af10e9a9e7b411e7a0b66f56c1477eb5idxr","distance":0,"vr":0,"srcVstreamType":0,"frameQa":871,"arGame":0}]
     * moduleTitles : [{"followId":99,"name":"精彩直播"},{"followId":100,"name":"精彩直播"}]
     * serv : 1
     * tagType : 2
     * duplicate : 0
     * recommend : 1
     * showImpress : 0
     * topContentBanner : 0
     * hideTag : 0
     * dedulicationFlag :
     * noDulication : 0
     */

    private int id;
    private String name;
    private int type;
    private String url;
    private int icon;
    private int sort;
    private int head;
    private int pageable;
    private int gameStyle;
    private int uninterested;
    private int serv;
    private int tagType;
    private int duplicate;
    private int recommend;
    private int showImpress;
    private int topContentBanner;
    private int hideTag;
    private String dedulicationFlag;
    private int noDulication;
    private List<ModulesBean> modules;
    @SerializedName("data")
    private List<PLayerListBean> data;
    private List<ModuleTitlesBean> moduleTitles;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public int getIcon()
    {
        return icon;
    }

    public void setIcon(int icon)
    {
        this.icon = icon;
    }

    public int getSort()
    {
        return sort;
    }

    public void setSort(int sort)
    {
        this.sort = sort;
    }

    public int getHead()
    {
        return head;
    }

    public void setHead(int head)
    {
        this.head = head;
    }

    public int getPageable()
    {
        return pageable;
    }

    public void setPageable(int pageable)
    {
        this.pageable = pageable;
    }

    public int getGameStyle()
    {
        return gameStyle;
    }

    public void setGameStyle(int gameStyle)
    {
        this.gameStyle = gameStyle;
    }

    public int getUninterested()
    {
        return uninterested;
    }

    public void setUninterested(int uninterested)
    {
        this.uninterested = uninterested;
    }

    public int getServ()
    {
        return serv;
    }

    public void setServ(int serv)
    {
        this.serv = serv;
    }

    public int getTagType()
    {
        return tagType;
    }

    public void setTagType(int tagType)
    {
        this.tagType = tagType;
    }

    public int getDuplicate()
    {
        return duplicate;
    }

    public void setDuplicate(int duplicate)
    {
        this.duplicate = duplicate;
    }

    public int getRecommend()
    {
        return recommend;
    }

    public void setRecommend(int recommend)
    {
        this.recommend = recommend;
    }

    public int getShowImpress()
    {
        return showImpress;
    }

    public void setShowImpress(int showImpress)
    {
        this.showImpress = showImpress;
    }

    public int getTopContentBanner()
    {
        return topContentBanner;
    }

    public void setTopContentBanner(int topContentBanner)
    {
        this.topContentBanner = topContentBanner;
    }

    public int getHideTag()
    {
        return hideTag;
    }

    public void setHideTag(int hideTag)
    {
        this.hideTag = hideTag;
    }

    public String getDedulicationFlag()
    {
        return dedulicationFlag;
    }

    public void setDedulicationFlag(String dedulicationFlag)
    {
        this.dedulicationFlag = dedulicationFlag;
    }

    public int getNoDulication()
    {
        return noDulication;
    }

    public void setNoDulication(int noDulication)
    {
        this.noDulication = noDulication;
    }

    public List<ModulesBean> getModules()
    {
        return modules;
    }

    public void setModules(List<ModulesBean> modules)
    {
        this.modules = modules;
    }

    public List<PLayerListBean> getData()
    {
        return data;
    }

    public void setData(List<PLayerListBean> data)
    {
        this.data = data;
    }

    public List<ModuleTitlesBean> getModuleTitles()
    {
        return moduleTitles;
    }

    public void setModuleTitles(List<ModuleTitlesBean> moduleTitles)
    {
        this.moduleTitles = moduleTitles;
    }

    public static class ModulesBean
    {
        /**
         * id : 102
         * name : 主播排行榜
         * type : 2004
         * url : yymobile://Web/Features/5/Url/http%253A%252F%252Fweb.yy.com%252Fgroup_act%252FhoursList%252F%2523%252FcurList
         * sort : 9
         * head : 0
         * pageable : 0
         * gameStyle : 0
         * uninterested : 0
         * data : [{"id":2236,"sort":1,"type":22,"scale":0,"style":0,"title":"全YY也只有她能凑齐哲佑利，九辰快乐到场道贺","thumb":"http://emyfs.bs2cdn.yy.com/MTI3NTRlMGMtYmNlMC00M2I0LWE2YjYtZTkzYTUzZWNhODEy.jpg","url":"yymobile://Web/Features/5/Url/http%253A%252F%252Fwww.yy.com%252Fyue%252Fmsg%252F82761","desc":"一个有着外站一姐称号，年收入1600万的女主播"},{"id":2237,"sort":1,"type":22,"scale":0,"style":0,"title":"小白龙直播间向九辰道歉？","thumb":"http://emyfs.bs2cdn.yy.com/MTI3NTRlMGMtYmNlMC00M2I0LWE2YjYtZTkzYTUzZWNhODEy.jpg","url":"yymobile://Web/Features/5/Url/http%253A%252F%252Fwww.yy.com%252Fyue%252Fmsg%252F82793","desc":"小白龙经过了之前的一系列的事件之后，最终还是回归舞帝"}]
         */

        private int id;
        private String name;
        private int type;
        private String url;
        private int sort;
        private int head;
        private int pageable;
        private int gameStyle;
        private int uninterested;
        private List<DataBean> data;

        public int getId()
        {
            return id;
        }

        public void setId(int id)
        {
            this.id = id;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public int getType()
        {
            return type;
        }

        public void setType(int type)
        {
            this.type = type;
        }

        public String getUrl()
        {
            return url;
        }

        public void setUrl(String url)
        {
            this.url = url;
        }

        public int getSort()
        {
            return sort;
        }

        public void setSort(int sort)
        {
            this.sort = sort;
        }

        public int getHead()
        {
            return head;
        }

        public void setHead(int head)
        {
            this.head = head;
        }

        public int getPageable()
        {
            return pageable;
        }

        public void setPageable(int pageable)
        {
            this.pageable = pageable;
        }

        public int getGameStyle()
        {
            return gameStyle;
        }

        public void setGameStyle(int gameStyle)
        {
            this.gameStyle = gameStyle;
        }

        public int getUninterested()
        {
            return uninterested;
        }

        public void setUninterested(int uninterested)
        {
            this.uninterested = uninterested;
        }

        public List<DataBean> getData()
        {
            return data;
        }

        public void setData(List<DataBean> data)
        {
            this.data = data;
        }

        public static class DataBean
        {
            /**
             * id : 2236
             * sort : 1
             * type : 22
             * scale : 0
             * style : 0
             * title : 全YY也只有她能凑齐哲佑利，九辰快乐到场道贺
             * thumb : http://emyfs.bs2cdn.yy.com/MTI3NTRlMGMtYmNlMC00M2I0LWE2YjYtZTkzYTUzZWNhODEy.jpg
             * url : yymobile://Web/Features/5/Url/http%253A%252F%252Fwww.yy.com%252Fyue%252Fmsg%252F82761
             * desc : 一个有着外站一姐称号，年收入1600万的女主播
             */

            private int id;
            private int sort;
            private int type;
            private int scale;
            private int style;
            private String title;
            private String thumb;
            private String url;
            private String desc;

            public int getId()
            {
                return id;
            }

            public void setId(int id)
            {
                this.id = id;
            }

            public int getSort()
            {
                return sort;
            }

            public void setSort(int sort)
            {
                this.sort = sort;
            }

            public int getType()
            {
                return type;
            }

            public void setType(int type)
            {
                this.type = type;
            }

            public int getScale()
            {
                return scale;
            }

            public void setScale(int scale)
            {
                this.scale = scale;
            }

            public int getStyle()
            {
                return style;
            }

            public void setStyle(int style)
            {
                this.style = style;
            }

            public String getTitle()
            {
                return title;
            }

            public void setTitle(String title)
            {
                this.title = title;
            }

            public String getThumb()
            {
                return thumb;
            }

            public void setThumb(String thumb)
            {
                this.thumb = thumb;
            }

            public String getUrl()
            {
                return url;
            }

            public void setUrl(String url)
            {
                this.url = url;
            }

            public String getDesc()
            {
                return desc;
            }

            public void setDesc(String desc)
            {
                this.desc = desc;
            }
        }
    }

    public static class PLayerListBean
    {
        /**
         * sort : 0
         * biz : pet
         * type : 1
         * scale : 0
         * gameStyle : 0
         * uid : 1861118716
         * sid : 1349611145
         * ssid : 1349611145
         * name : 萌宠75-Michael
         * desc : 汪星人圣诞节的那些事
         * startTime : 1514014415
         * liveTime : 472
         * avatar : http://downhdlogo.yy.com/hdlogo/6060/60/60/11/1861118716/u1861118716Xd8bob_.jpeg
         * thumb : http://emyfs.bs2cdn.yy.com/OThkM2U4YTUtNjBjOC00YjE0LTgxZjQtMmNjYjhkZjZlOGJl.jpg?imageview/4/3/w/368/h/207/blur/1
         * users : 19790
         * tagStyle : 0
         * tpl : 16777217
         * yyNum : 2113774874
         * thumb2 : http://emyfs.bs2cdn.yy.com/OThkM2U4YTUtNjBjOC00YjE0LTgxZjQtMmNjYjhkZjZlOGJl.jpg?imageview/4/0/w/363/h/330/blur/1
         * img : http://emyfs.bs2cdn.yy.com/OThkM2U4YTUtNjBjOC00YjE0LTgxZjQtMmNjYjhkZjZlOGJl.jpg?imageview/4/0/w/363/h/330/blur/1
         * pid : 15013x03_1349611145_1861118716_1514014414_1514014414
         * snapshot : http://screenshot.dwstatic.com/yysnapshot/17123862f1b1a1272bac20df855d5a8d2cea4d6ce6f0?imageview/4/0/w/363/h/330/blur/1
         * ru : 18
         * linkMic : 0
         * token : af10e9a9e7b411e7a0b66f56c1477eb5idxr
         * distance : 0
         * vr : 0
         * srcVstreamType : 0
         * frameQa : 4448
         * arGame : 0
         * site : 广州市
         * verify : 3
         * totalUser : 0
         * totalLike : 0
         * quality : 2
         * deviceType : 4
         * groupId : 0
         * tag : 公会推荐
         * logo : http://emyfs.bs2cdn.yy.com/NGU2MTM2MjUtN2JiNi00OTMwLWEzMDctMTM3OTc4MTJhM2Qz.png
         */

        private int sort;
        private String biz;
        private int type;
        private int scale;
        private int gameStyle;
        private String uid;
        private String sid;
        private String ssid;
        private String name;
        private String desc;
        private int startTime;
        private int liveTime;
        private String avatar;
        private String thumb;
        private String users;
        private int tagStyle;
        private String tpl;
        private String yyNum;
        private String thumb2;
        private String img;
        private String pid;
        private String snapshot;
        private int ru;
        private int linkMic;
        private String token;
        private int distance;
        private int vr;
        private int srcVstreamType;
        private int frameQa;
        private int arGame;
        private String site;
        private int verify;
        private int totalUser;
        private int totalLike;
        private int quality;
        private int deviceType;
        private int groupId;
        private String tag;
        private String logo;

        public int getSort()
        {
            return sort;
        }

        public void setSort(int sort)
        {
            this.sort = sort;
        }

        public String getBiz()
        {
            return biz;
        }

        public void setBiz(String biz)
        {
            this.biz = biz;
        }

        public int getType()
        {
            return type;
        }

        public void setType(int type)
        {
            this.type = type;
        }

        public int getScale()
        {
            return scale;
        }

        public void setScale(int scale)
        {
            this.scale = scale;
        }

        public int getGameStyle()
        {
            return gameStyle;
        }

        public void setGameStyle(int gameStyle)
        {
            this.gameStyle = gameStyle;
        }

        public String getUid()
        {
            return uid;
        }

        public void setUid(String uid)
        {
            this.uid = uid;
        }

        public String getSid()
        {
            return sid;
        }

        public void setSid(String sid)
        {
            this.sid = sid;
        }

        public String getSsid()
        {
            return ssid;
        }

        public void setSsid(String ssid)
        {
            this.ssid = ssid;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getDesc()
        {
            return desc;
        }

        public void setDesc(String desc)
        {
            this.desc = desc;
        }

        public int getStartTime()
        {
            return startTime;
        }

        public void setStartTime(int startTime)
        {
            this.startTime = startTime;
        }

        public int getLiveTime()
        {
            return liveTime;
        }

        public void setLiveTime(int liveTime)
        {
            this.liveTime = liveTime;
        }

        public String getAvatar()
        {
            return avatar;
        }

        public void setAvatar(String avatar)
        {
            this.avatar = avatar;
        }

        public String getThumb()
        {
            return thumb;
        }

        public void setThumb(String thumb)
        {
            this.thumb = thumb;
        }

        public String getUsers()
        {
            return users;
        }

        public void setUsers(String users)
        {
            this.users = users;
        }

        public int getTagStyle()
        {
            return tagStyle;
        }

        public void setTagStyle(int tagStyle)
        {
            this.tagStyle = tagStyle;
        }

        public String getTpl()
        {
            return tpl;
        }

        public void setTpl(String tpl)
        {
            this.tpl = tpl;
        }

        public String getYyNum()
        {
            return yyNum;
        }

        public void setYyNum(String yyNum)
        {
            this.yyNum = yyNum;
        }

        public String getThumb2()
        {
            return thumb2;
        }

        public void setThumb2(String thumb2)
        {
            this.thumb2 = thumb2;
        }

        public String getImg()
        {
            return img;
        }

        public void setImg(String img)
        {
            this.img = img;
        }

        public String getPid()
        {
            return pid;
        }

        public void setPid(String pid)
        {
            this.pid = pid;
        }

        public String getSnapshot()
        {
            return snapshot;
        }

        public void setSnapshot(String snapshot)
        {
            this.snapshot = snapshot;
        }

        public int getRu()
        {
            return ru;
        }

        public void setRu(int ru)
        {
            this.ru = ru;
        }

        public int getLinkMic()
        {
            return linkMic;
        }

        public void setLinkMic(int linkMic)
        {
            this.linkMic = linkMic;
        }

        public String getToken()
        {
            return token;
        }

        public void setToken(String token)
        {
            this.token = token;
        }

        public int getDistance()
        {
            return distance;
        }

        public void setDistance(int distance)
        {
            this.distance = distance;
        }

        public int getVr()
        {
            return vr;
        }

        public void setVr(int vr)
        {
            this.vr = vr;
        }

        public int getSrcVstreamType()
        {
            return srcVstreamType;
        }

        public void setSrcVstreamType(int srcVstreamType)
        {
            this.srcVstreamType = srcVstreamType;
        }

        public int getFrameQa()
        {
            return frameQa;
        }

        public void setFrameQa(int frameQa)
        {
            this.frameQa = frameQa;
        }

        public int getArGame()
        {
            return arGame;
        }

        public void setArGame(int arGame)
        {
            this.arGame = arGame;
        }

        public String getSite()
        {
            return site;
        }

        public void setSite(String site)
        {
            this.site = site;
        }

        public int getVerify()
        {
            return verify;
        }

        public void setVerify(int verify)
        {
            this.verify = verify;
        }

        public int getTotalUser()
        {
            return totalUser;
        }

        public void setTotalUser(int totalUser)
        {
            this.totalUser = totalUser;
        }

        public int getTotalLike()
        {
            return totalLike;
        }

        public void setTotalLike(int totalLike)
        {
            this.totalLike = totalLike;
        }

        public int getQuality()
        {
            return quality;
        }

        public void setQuality(int quality)
        {
            this.quality = quality;
        }

        public int getDeviceType()
        {
            return deviceType;
        }

        public void setDeviceType(int deviceType)
        {
            this.deviceType = deviceType;
        }

        public int getGroupId()
        {
            return groupId;
        }

        public void setGroupId(int groupId)
        {
            this.groupId = groupId;
        }

        public String getTag()
        {
            return tag;
        }

        public void setTag(String tag)
        {
            this.tag = tag;
        }

        public String getLogo()
        {
            return logo;
        }

        public void setLogo(String logo)
        {
            this.logo = logo;
        }
    }

    public static class ModuleTitlesBean
    {
        /**
         * followId : 99
         * name : 精彩直播
         */

        private int followId;
        private String name;

        public int getFollowId()
        {
            return followId;
        }

        public void setFollowId(int followId)
        {
            this.followId = followId;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }
    }
}

