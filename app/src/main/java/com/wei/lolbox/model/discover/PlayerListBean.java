package com.wei.lolbox.model.discover;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者：赵若位
 * 时间：2017/12/16
 * 邮箱：1070138445@qq.com
 * 功能：查询召唤师详情
 */

public class PlayerListBean
{
    private boolean followed;
    private boolean is_myself;
    @SerializedName("game_type_list")
    private List<GameTypeListBean> game_type_list;
    @SerializedName("player_list")
    private List<ListBean> player_list;

    public boolean isFollowed()
    {
        return followed;
    }

    public void setFollowed(boolean followed)
    {
        this.followed = followed;
    }

    public boolean isIs_myself()
    {
        return is_myself;
    }

    public void setIs_myself(boolean is_myself)
    {
        this.is_myself = is_myself;
    }

    public List<GameTypeListBean> getGame_type_list()
    {
        return game_type_list;
    }

    public void setGame_type_list(List<GameTypeListBean> game_type_list)
    {
        this.game_type_list = game_type_list;
    }

    public List<ListBean> getPlayer_list()
    {
        return player_list;
    }

    public void setPlayer_list(List<ListBean> player_list)
    {
        this.player_list = player_list;
    }

    public static class GameTypeListBean
    {
        /**
         * const : 3
         * name_cn : 匹配赛
         */

        @SerializedName("const")
        private int constX;
        private String name_cn;

        public int getConstX()
        {
            return constX;
        }

        public void setConstX(int constX)
        {
            this.constX = constX;
        }

        public String getName_cn()
        {
            return name_cn;
        }

        public void setName_cn(String name_cn)
        {
            this.name_cn = name_cn;
        }
    }


    public static class ListBean
    {
        /**
         * total_lose_normal : 1749
         * total_leave_aram : 0
         * last_modified_ranked : 2017-08-14T04:32:58
         * win_rate : 51.8
         * rank : 5
         * stat_perf : {"position":{"support":0,"top":0,"jungler":0,"adc":0,"mid":0},"kda":{"quadra_kills":0,"total_k":0,"total_win":0,"total_lose":0,"total_a":0,"total_d":0,"triple_kills":0,"penta_kills":0,"god_like_num":0},"total_game":0}
         * total_lose_bot : 8
         * win_ratio_score : 1554
         * user_id : 2949347757
         * game_zone : {"pinyin":"dx9","area_id":13,"server_name":"电信九","alias":"裁决之地"}
         * win_battle_score : 2779
         * formatted_ranked_history : {"s3":{"le":0,"lo":0,"r_zh":"-","p":0,"r":0,"t":0,"w":0,"t_zh":"无段位"},"last_season_name":"flex_sr","s7":{"le":1,"lo":69,"r_zh":"I","p":0,"r":1,"t":2,"w":78,"t_zh":"白银"},"s6":{"le":0,"lo":1,"r_zh":"II","p":31,"r":2,"t":3,"w":232,"t_zh":"黄金"},"s5":{"lo":0,"t_zh":"-","w":278,"r_zh":"-"},"s4":{"lo":288,"t_zh":"-","w":295,"r_zh":"-"},"flex_sr":{"le":0,"lo":0,"r_zh":"V","p":0,"r":5,"t":3,"w":32,"t_zh":"黄金"}}
         * pn : 老公我可以吃药
         * total_lose_aram : 7
         * total_win_normal : 1841
         * total_win_bot : 54
         * total_win_aram : 15
         * game_recent_list : [{"user_id":2949347757,"champion":{"display_name":"皮城女警","name":"Caitlyn","title":"凯特琳","id":51},"created":"2017-12-14T14:48:11","game_type":{"const":3,"name_cn":"匹配赛"},"champion_id":51,"flag_mvp_carry":0,"collect":false,"game_zone":{"pinyin":"dx9","area_id":13,"server_name":"电信九","alias":"裁决之地"},"collected":false,"game_id":1285289772,"spells_in_s":"","game_type_const":3,"battle_result":true},{"user_id":2949347757,"champion":{"display_name":"暴走萝莉","name":"Jinx","title":"金克丝","id":222},"created":"2017-11-13T15:56:05","game_type":{"const":3,"name_cn":"匹配赛"},"champion_id":222,"flag_mvp_carry":1,"collect":false,"game_zone":{"pinyin":"dx9","area_id":13,"server_name":"电信九","alias":"裁决之地"},"collected":false,"game_id":1275392711,"spells_in_s":"","game_type_const":3,"battle_result":true},{"user_id":2949347757,"champion":{"display_name":"皮城女警","name":"Caitlyn","title":"凯特琳","id":51},"created":"2017-11-13T15:11:59","game_type":{"const":3,"name_cn":"匹配赛"},"champion_id":51,"flag_mvp_carry":0,"collect":false,"game_zone":{"pinyin":"dx9","area_id":13,"server_name":"电信九","alias":"裁决之地"},"collected":false,"game_id":1275330964,"spells_in_s":"","game_type_const":3,"battle_result":false},{"user_id":2949347757,"champion":{"display_name":"暴走萝莉","name":"Jinx","title":"金克丝","id":222},"created":"2017-11-11T08:49:42","game_type":{"const":4,"name_cn":"单双排"},"champion_id":222,"flag_mvp_carry":1,"collect":false,"game_zone":{"pinyin":"dx9","area_id":13,"server_name":"电信九","alias":"裁决之地"},"collected":false,"game_id":1274339274,"spells_in_s":"","game_type_const":4,"battle_result":true},{"user_id":2949347757,"champion":{"display_name":"暴走萝莉","name":"Jinx","title":"金克丝","id":222},"created":"2017-11-05T05:18:37","game_type":{"const":4,"name_cn":"单双排"},"champion_id":222,"flag_mvp_carry":0,"collect":false,"game_zone":{"pinyin":"dx9","area_id":13,"server_name":"电信九","alias":"裁决之地"},"collected":false,"game_id":1272318561,"spells_in_s":"","game_type_const":4,"battle_result":true},{"user_id":2949347757,"champion":{"display_name":"暴走萝莉","name":"Jinx","title":"金克丝","id":222},"created":"2017-11-01T14:19:24","game_type":{"const":4,"name_cn":"单双排"},"champion_id":222,"flag_mvp_carry":0,"collect":false,"game_zone":{"pinyin":"dx9","area_id":13,"server_name":"电信九","alias":"裁决之地"},"collected":false,"game_id":1271251930,"spells_in_s":"","game_type_const":4,"battle_result":true},{"user_id":2949347757,"champion":{"display_name":"暴走萝莉","name":"Jinx","title":"金克丝","id":222},"created":"2017-10-26T12:27:59","game_type":{"const":4,"name_cn":"单双排"},"champion_id":222,"flag_mvp_carry":0,"collect":false,"game_zone":{"pinyin":"dx9","area_id":13,"server_name":"电信九","alias":"裁决之地"},"collected":false,"game_id":1268711115,"spells_in_s":"","game_type_const":4,"battle_result":false}]
         * tier_rank : {"tier":{"name_cn":"黄金","const":3,"name":"gold","full_name_cn":"荣耀黄金"},"url_img":"http://static.lolbox.duowan.com/images/rank/3_50x50.png","rank":{"const":5,"name_cn":null,"name":"V"},"league_points":0}
         * last_modified : 2017-12-14T14:48:11
         * tier : 3
         * last_modified_bot : 2016-10-16T14:19:44
         * league_points : 0
         * icon : 3186
         * elo_score : 3105
         * box_score : 7438
         * last_modified_aram : 2017-01-11T12:14:07
         * like : 2029
         * unlike : 895
         * level : 38
         * last_modified_normal : 2017-12-14T14:48:11
         * total_leave_normal : 45
         * champion_performance_list : [{"mvp":39,"gpm":372,"mk10m":45,"champion":{"display_name":"皮城女警","name":"Caitlyn","title":"凯特琳","id":51},"d":5,"win":166,"k":7.4,"win_rate":55,"l":5,"times":300,"ddpm":722,"a":9,"kda_score":2.7,"carry":3,"id":51,"t":1513262891},{"mvp":115,"gpm":404,"mk10m":50,"champion":{"display_name":"暴走萝莉","name":"Jinx","title":"金克丝","id":222},"d":5,"win":357,"k":9,"win_rate":56,"l":5,"times":634,"ddpm":748,"a":8,"kda_score":2.8,"carry":13,"id":222,"t":1510588565},{"mvp":10,"gpm":363,"mk10m":30,"champion":{"display_name":"瘟疫之源","name":"Twitch","title":"图奇","id":29},"win":64,"k":8,"win_rate":48,"l":5,"times":133,"ddpm":613,"a":8,"kda_score":2.6,"t":1506053442,"carry":2,"id":29,"d":5.1},{"mvp":10,"gpm":354,"mk10m":48,"champion":{"display_name":"复仇之矛","name":"Kalista","title":"卡莉丝塔","id":429},"win":34,"k":6,"win_rate":54,"l":5,"times":62,"ddpm":570,"a":7.1,"kda_score":2.1,"t":1500111917,"carry":0,"id":429,"d":5.2},{"mvp":0,"gpm":500,"mk10m":55,"champion":{"display_name":"逆羽","name":"Xayah","title":"霞","id":498},"win":1,"k":8,"win_rate":100,"times":1,"ddpm":945,"t":1499509276,"a":12,"kda_score":2.9,"carry":0,"id":498,"d":6},{"mvp":2,"gpm":326,"mk10m":32,"champion":{"display_name":"寒冰射手","name":"Ashe","title":"艾希","id":22},"win":66,"k":3.5,"win_rate":55,"l":null,"times":118,"ddpm":480,"a":11.8,"kda_score":2,"t":1498886274,"carry":0,"id":22,"d":6.7},{"mvp":17,"gpm":384,"mk10m":52,"champion":{"display_name":"麦林炮手","name":"Tristana","title":"崔丝塔娜","id":18},"win":92,"k":8.1,"win_rate":50,"l":5,"times":182,"ddpm":659,"a":7.1,"kda_score":2.5,"t":1489849252,"carry":0,"id":18,"d":5},{"mvp":3,"gpm":411,"mk10m":46,"champion":{"display_name":"荣耀行刑官","name":"Draven","title":"德莱文","id":119},"d":6.2,"win":11,"k":8.1,"win_rate":45,"l":null,"times":24,"ddpm":707,"a":8.2,"kda_score":2.3,"carry":0,"id":119,"t":1485346653},{"mvp":1,"gpm":340,"mk10m":46,"champion":{"display_name":"深渊巨口","name":"KogMaw","title":"克格莫","id":96},"win":26,"k":7.1,"win_rate":54,"l":3,"times":48,"ddpm":595,"a":7.1,"kda_score":2.3,"t":1482157501,"carry":0,"id":96,"d":5.2},{"mvp":0,"gpm":355,"mk10m":70,"champion":{"display_name":"武器大师","name":"Jax","title":"贾克斯","id":24},"d":10.9,"win":11,"k":3.2,"win_rate":37,"l":null,"times":29,"ddpm":563,"a":18.9,"kda_score":1.9,"carry":0,"id":24,"t":1479653098},{"mvp":0,"gpm":332,"mk10m":32,"champion":{"display_name":"水晶先锋","name":"Skarner","title":"斯卡纳","id":72},"d":4.5,"win":5,"k":3.1,"win_rate":35,"l":null,"times":14,"ddpm":244,"a":8.2,"kda_score":2.1,"carry":1,"id":72,"t":1478011789},{"mvp":4,"gpm":391,"mk10m":50,"champion":{"display_name":"戏命师","name":"Jhin","title":"烬","id":202},"win":17,"k":9.4,"win_rate":47,"l":4,"times":36,"ddpm":801,"a":11.3,"kda_score":3,"t":1476542338,"carry":1,"id":202,"d":5.9},{"mvp":0,"gpm":308,"mk10m":29,"champion":{"display_name":"生化魔人","name":"Zac","title":"扎克","id":154},"win":1,"k":3,"win_rate":12,"l":null,"times":8,"ddpm":292,"a":10.9,"kda_score":2.3,"t":1475565923,"carry":1,"id":154,"d":5.1},{"mvp":0,"gpm":259,"mk10m":3,"champion":{"display_name":"唤潮鲛姬","name":"Nami","title":"娜美","id":267},"d":8,"win":9,"k":2,"win_rate":36,"l":null,"times":25,"ddpm":336,"a":13.2,"kda_score":1.7,"carry":0,"id":267,"t":1475499720},{"mvp":0,"gpm":353,"mk10m":55,"champion":{"display_name":"探险家","name":"Ezreal","title":"伊泽瑞尔","id":81},"d":6.2,"win":2,"k":7.1,"win_rate":22,"l":null,"times":9,"ddpm":742,"a":9.3,"kda_score":2.3,"carry":1,"id":81,"t":1475076652},{"mvp":1,"gpm":357,"mk10m":49,"champion":{"display_name":"惩戒之箭","name":"Varus","title":"韦鲁斯","id":110},"d":7.7,"win":4,"k":6.8,"win_rate":28,"l":null,"times":14,"ddpm":759,"a":11.8,"kda_score":2.1,"carry":1,"id":110,"t":1474897047},{"mvp":0,"gpm":507,"mk10m":59,"champion":{"display_name":"邪恶小法师","name":"Veigar","title":"维迦","id":45},"win":1,"k":18,"win_rate":100,"times":1,"ddpm":1086,"t":1474894076,"a":6,"kda_score":2.4,"carry":0,"id":45,"d":9},{"mvp":0,"gpm":328,"mk10m":30,"champion":{"display_name":"齐天大圣","name":"MonkeyKing","title":"孙悟空","id":62},"d":6.7,"win":1,"k":4.6,"win_rate":14,"l":null,"times":7,"ddpm":449,"a":8.1,"kda_score":1.6,"carry":0,"id":62,"t":1474885851},{"mvp":0,"gpm":275,"mk10m":12,"champion":{"display_name":"曙光女神","name":"Leona","title":"蕾欧娜","id":89},"win":3,"k":2,"win_rate":20,"l":null,"times":15,"ddpm":304,"a":18.5,"kda_score":2.9,"t":1474541385,"carry":0,"id":89,"d":6.1},{"mvp":24,"gpm":396,"mk10m":58,"champion":{"display_name":"赏金猎人","name":"MissFortune","title":"厄运小姐","id":21},"win":350,"k":7,"win_rate":57,"l":5,"times":606,"ddpm":630,"a":8,"kda_score":2.9,"t":0,"carry":2,"id":21,"d":4.1},{"mvp":0,"gpm":351,"mk10m":32,"champion":{"display_name":"皮城执法官","name":"Vi","title":"蔚","id":254},"win":191,"k":8,"win_rate":49,"l":null,"times":384,"ddpm":492,"a":7,"kda_score":2.5,"t":0,"carry":0,"id":254,"d":5},{"mvp":1,"gpm":306,"mk10m":25,"champion":{"display_name":"狂战士","name":"Olaf","title":"奥拉夫","id":2},"win":99,"k":4,"win_rate":46,"l":null,"times":211,"ddpm":346,"a":7,"kda_score":2.2,"t":0,"carry":0,"id":2,"d":4},{"mvp":6,"gpm":300,"mk10m":10,"champion":{"display_name":"堕落天使","name":"Morgana","title":"莫甘娜","id":25},"win":101,"k":3,"win_rate":50,"l":5,"times":201,"ddpm":369,"a":13,"kda_score":2.3,"t":0,"carry":0,"id":25,"d":6},{"mvp":1,"gpm":312,"mk10m":25,"champion":{"display_name":"迅捷斥候","name":"Teemo","title":"提莫","id":17},"win":90,"k":5,"win_rate":53,"l":2,"times":169,"ddpm":619,"a":8,"kda_score":1.6,"t":0,"carry":1,"id":17,"d":7},{"mvp":2,"gpm":356,"mk10m":32,"champion":{"display_name":"祖安怒兽","name":"Warwick","title":"沃里克","id":19},"win":75,"k":8,"win_rate":60,"l":null,"times":124,"ddpm":459,"a":10,"kda_score":3.6,"t":0,"carry":0,"id":19,"d":4},{"mvp":0,"gpm":276,"mk10m":7,"champion":{"display_name":"蒸汽机器人","name":"Blitzcrank","title":"布里茨","id":53},"win":65,"k":2,"win_rate":53,"l":null,"times":121,"ddpm":304,"a":14,"kda_score":2.3,"t":0,"carry":0,"id":53,"d":6},{"mvp":5,"gpm":359,"mk10m":50,"champion":{"display_name":"法外狂徒","name":"Graves","title":"格雷福斯","id":104},"win":48,"k":7,"win_rate":55,"l":2,"times":87,"ddpm":545,"a":7,"kda_score":2.3,"t":0,"carry":0,"id":104,"d":5},{"mvp":1,"gpm":297,"mk10m":21,"champion":{"display_name":"深海泰坦","name":"Nautilus","title":"诺提勒斯","id":111},"win":36,"k":2,"win_rate":49,"l":null,"times":73,"ddpm":332,"a":11,"kda_score":2.6,"t":0,"carry":0,"id":111,"d":4},{"mvp":0,"gpm":279,"mk10m":29,"champion":{"display_name":"熔岩巨兽","name":"Malphite","title":"墨菲特","id":54},"win":30,"k":3,"win_rate":42,"l":null,"times":70,"ddpm":305,"a":8,"kda_score":1.8,"t":0,"carry":0,"id":54,"d":5},{"mvp":0,"gpm":282,"mk10m":12,"champion":{"display_name":"弗雷尔卓德之心","name":"Braum","title":"布隆","id":201},"win":33,"k":1,"win_rate":47,"l":null,"times":69,"ddpm":266,"a":16,"kda_score":2.8,"t":0,"carry":0,"id":201,"d":5},{"mvp":0,"gpm":266,"mk10m":31,"champion":{"display_name":"沙漠死神","name":"Nasus","title":"内瑟斯","id":75},"win":35,"k":1,"win_rate":51,"l":null,"times":68,"ddpm":287,"a":3,"kda_score":0.5,"t":0,"carry":0,"id":75,"d":7},{"mvp":2,"gpm":334,"mk10m":28,"champion":{"display_name":"祖安狂人","name":"DrMundo","title":"蒙多医生","id":36},"win":30,"k":5,"win_rate":50,"l":null,"times":60,"ddpm":457,"a":9,"kda_score":2.3,"t":0,"carry":0,"id":36,"d":5},{"mvp":0,"gpm":326.3,"mk10m":45.3,"champion":{"display_name":"暗夜猎手","name":"Vayne","title":"薇恩","id":67},"win":23,"k":4.9,"win_rate":39,"l":null,"times":58,"ddpm":543.3,"a":6.8,"kda_score":1.5,"t":0,"carry":0,"id":67,"d":7},{"mvp":0,"gpm":314.9,"mk10m":23.4,"champion":{"display_name":"德玛西亚之力","name":"Garen","title":"盖伦","id":86},"win":26,"k":6.1,"win_rate":55,"l":null,"times":47,"ddpm":459.9,"a":7,"kda_score":2.1,"t":0,"carry":1,"id":86,"d":5.3},{"mvp":1,"gpm":348,"mk10m":42,"champion":{"display_name":"龙血武姬","name":"Shyvana","title":"希瓦娜","id":102},"win":21,"k":3,"win_rate":46,"l":null,"times":45,"ddpm":353,"a":5.9,"kda_score":2.2,"t":0,"carry":1,"id":102,"d":3},{"mvp":1,"gpm":242,"mk10m":6,"champion":{"display_name":"牛头酋长","name":"Alistar","title":"阿利斯塔","id":12},"win":19,"k":1,"win_rate":42,"l":null,"times":45,"ddpm":215,"a":13,"kda_score":3.5,"t":0,"carry":0,"id":12,"d":3},{"mvp":1,"gpm":417,"mk10m":49,"champion":{"display_name":"蛮族之王","name":"Tryndamere","title":"泰达米尔","id":23},"win":25,"k":10,"win_rate":62,"l":null,"times":40,"ddpm":778,"a":6,"kda_score":1.8,"t":0,"carry":0,"id":23,"d":8},{"mvp":0,"gpm":271,"mk10m":21,"champion":{"display_name":"披甲龙龟","name":"Rammus","title":"拉莫斯","id":33},"win":19,"k":2.2,"win_rate":52,"l":null,"times":36,"ddpm":301,"a":6.2,"kda_score":1.4,"t":0,"carry":0,"id":33,"d":5},{"mvp":1,"gpm":399,"mk10m":34,"champion":{"display_name":"殇之木乃伊","name":"Amumu","title":"阿木木","id":32},"win":18,"k":10,"win_rate":51,"l":null,"times":35,"ddpm":618,"a":10,"kda_score":4,"t":0,"carry":1,"id":32,"d":4},{"mvp":2,"gpm":362,"mk10m":29,"champion":{"display_name":"德玛西亚皇子","name":"JarvanIV","title":"嘉文四世","id":59},"win":20,"k":6,"win_rate":58,"l":null,"times":34,"ddpm":432,"a":13,"kda_score":2.7,"t":0,"carry":0,"id":59,"d":6},{"mvp":0,"gpm":361,"mk10m":48,"champion":{"display_name":"暗裔剑魔","name":"Aatrox","title":"亚托克斯","id":266},"win":11,"k":7,"win_rate":37,"l":null,"times":29,"ddpm":437,"a":11,"kda_score":2,"t":0,"carry":0,"id":266,"d":8},{"mvp":0,"gpm":304,"mk10m":23,"champion":{"display_name":"战争之王","name":"Pantheon","title":"潘森","id":80},"win":9,"k":5,"win_rate":34,"l":null,"times":26,"ddpm":312,"a":8,"kda_score":2.6,"t":0,"carry":0,"id":80,"d":4},{"mvp":2,"gpm":355,"mk10m":32,"champion":{"display_name":"雷霆咆哮","name":"Volibear","title":"沃利贝尔","id":106},"win":13,"k":6,"win_rate":50,"l":null,"times":26,"ddpm":400,"a":6,"kda_score":3,"t":0,"carry":1,"id":106,"d":3},{"mvp":0,"gpm":313,"mk10m":24,"champion":{"display_name":"寡妇制造者","name":"Evelynn","title":"伊芙琳","id":28},"win":7,"k":5,"win_rate":29,"l":null,"times":24,"ddpm":295,"a":3,"kda_score":1.3,"t":0,"carry":0,"id":28,"d":5},{"mvp":2,"gpm":314,"mk10m":24,"champion":{"display_name":"雪人骑士","name":"Nunu","title":"努努","id":20},"win":11,"k":4,"win_rate":50,"l":null,"times":22,"ddpm":326,"a":10,"kda_score":2.3,"t":0,"carry":0,"id":20,"d":5},{"mvp":0,"gpm":330,"mk10m":30,"champion":{"display_name":"战争之影","name":"Hecarim","title":"赫卡里姆","id":120},"win":10,"k":5,"win_rate":45,"l":null,"times":22,"ddpm":350,"a":8,"kda_score":1.9,"t":0,"carry":0,"id":120,"d":6},{"mvp":1,"gpm":316,"mk10m":28,"champion":{"display_name":"虚空掠夺者","name":"Khazix","title":"卡兹克","id":121},"win":6,"k":5,"win_rate":28,"l":null,"times":21,"ddpm":333,"a":5,"kda_score":1.7,"t":0,"carry":0,"id":121,"d":5},{"mvp":2,"gpm":393,"mk10m":26,"champion":{"display_name":"北地之怒","name":"Sejuani","title":"瑟庄妮","id":113},"win":13,"k":6.7,"win_rate":68,"l":null,"times":19,"ddpm":512,"a":11,"kda_score":3.9,"t":0,"carry":0,"id":113,"d":3.5},{"mvp":0,"gpm":263,"mk10m":7,"champion":{"display_name":"魂锁典狱长","name":"Thresh","title":"锤石","id":412},"win":8,"k":2,"win_rate":47,"l":null,"times":17,"ddpm":240,"a":16,"kda_score":2,"t":0,"carry":0,"id":412,"d":8},{"mvp":0,"gpm":273,"mk10m":15,"champion":{"display_name":"河流之王","name":"TahmKench","title":"塔姆","id":223},"win":6,"k":2,"win_rate":40,"l":null,"times":15,"ddpm":268,"a":12,"kda_score":1.8,"t":0,"carry":0,"id":223,"d":7},{"mvp":0,"gpm":346,"mk10m":33,"champion":{"display_name":"亡灵战神","name":"Sion","title":"赛恩","id":14},"win":7,"k":5,"win_rate":50,"l":null,"times":14,"ddpm":478,"a":14,"kda_score":2.7,"t":0,"carry":1,"id":14,"d":6},{"mvp":1,"gpm":349,"mk10m":35,"champion":{"display_name":"巨魔之王","name":"Trundle","title":"特朗德尔","id":48},"win":5,"k":5,"win_rate":38,"l":null,"times":13,"ddpm":381,"a":10,"kda_score":3,"t":0,"carry":1,"id":48,"d":4},{"mvp":0,"gpm":285.8,"mk10m":3,"champion":{"display_name":"天启者","name":"Karma","title":"卡尔玛","id":43},"win":3,"k":3,"win_rate":23,"l":null,"times":13,"ddpm":330.9,"a":8.5,"kda_score":1.4,"t":0,"carry":0,"id":43,"d":7},{"mvp":0,"gpm":280,"mk10m":4,"champion":{"display_name":"风暴之怒","name":"Janna","title":"迦娜","id":40},"win":7,"k":1,"win_rate":53,"l":null,"times":13,"ddpm":181,"a":14,"kda_score":2.5,"t":0,"carry":0,"id":40,"d":5},{"mvp":1,"gpm":352,"mk10m":56,"champion":{"display_name":"圣枪游侠","name":"Lucian","title":"卢锡安","id":236},"win":3,"k":5,"win_rate":25,"l":null,"times":12,"ddpm":491,"a":5,"kda_score":1.4,"t":0,"carry":0,"id":236,"d":6},{"mvp":0,"gpm":313,"mk10m":27,"champion":{"display_name":"虚空恐惧","name":"Chogath","title":"科加斯","id":31},"win":4,"k":4,"win_rate":36,"l":null,"times":11,"ddpm":335,"a":5,"kda_score":1.5,"t":0,"carry":0,"id":31,"d":5},{"mvp":0,"gpm":343,"mk10m":31,"champion":{"display_name":"傲之追猎者","name":"Rengar","title":"雷恩加尔","id":107},"win":3,"k":5,"win_rate":37,"l":null,"times":8,"ddpm":319,"a":8,"kda_score":1.9,"t":0,"carry":0,"id":107,"d":6},{"mvp":0,"gpm":347,"mk10m":59,"champion":{"display_name":"放逐之刃","name":"Riven","title":"锐雯","id":92},"win":4,"k":5,"win_rate":50,"l":null,"times":8,"ddpm":561,"a":6,"kda_score":1.4,"t":0,"carry":0,"id":92,"d":7},{"mvp":0,"gpm":339,"mk10m":52,"champion":{"display_name":"战争女神","name":"Sivir","title":"希维尔","id":15},"win":1,"k":3,"win_rate":12,"l":null,"times":8,"ddpm":547,"a":7.9,"kda_score":1.4,"t":0,"carry":0,"id":15,"d":7},{"mvp":0,"gpm":251,"mk10m":2,"champion":{"display_name":"众星之子","name":"Soraka","title":"索拉卡","id":16},"win":3,"k":0,"win_rate":42,"l":null,"times":7,"ddpm":106,"a":16,"kda_score":4,"t":0,"carry":0,"id":16,"d":3},{"mvp":0,"gpm":305,"mk10m":25,"champion":{"display_name":"蜘蛛女皇","name":"Elise","title":"伊莉丝","id":60},"win":1,"k":5,"win_rate":16,"l":null,"times":6,"ddpm":313,"a":6,"kda_score":1.6,"t":0,"carry":0,"id":60,"d":6},{"mvp":0,"gpm":0,"mk10m":0,"champion":{"display_name":"时光守护者","name":"Zilean","title":"基兰","id":26},"win":2,"k":0,"win_rate":40,"l":0,"times":5,"ddpm":0,"a":0,"kda_score":0,"t":0,"carry":0,"id":26,"d":0},{"mvp":0,"gpm":280,"mk10m":35,"champion":{"display_name":"扭曲树精","name":"Maokai","title":"茂凯","id":57},"win":1,"k":1,"win_rate":20,"l":null,"times":5,"ddpm":246,"a":3,"kda_score":1,"t":0,"carry":0,"id":57,"d":3},{"mvp":0,"gpm":380,"mk10m":30,"champion":{"display_name":"永恒梦魇","name":"Nocturne","title":"魔腾","id":56},"win":3,"k":8,"win_rate":60,"l":null,"times":5,"ddpm":409,"a":7,"kda_score":2.4,"t":0,"carry":1,"id":56,"d":5.2},{"mvp":0,"gpm":283,"mk10m":10,"champion":{"display_name":"暗影之拳","name":"Akali","title":"阿卡丽","id":84},"win":3,"k":4,"win_rate":75,"l":null,"times":4,"ddpm":392.3,"a":8,"kda_score":1.5,"t":0,"carry":0,"id":84,"d":7},{"mvp":0,"gpm":270,"mk10m":21,"champion":{"display_name":"无畏战车","name":"Urgot","title":"厄加特","id":6},"win":0,"k":2,"win_rate":0,"l":null,"times":4,"ddpm":324,"a":9,"kda_score":1.4,"t":0,"carry":0,"id":6,"d":7},{"mvp":0,"gpm":269,"mk10m":8,"champion":{"display_name":"瓦洛兰之盾","name":"Taric","title":"塔里克","id":44},"win":1,"k":3,"win_rate":25,"l":null,"times":4,"ddpm":269,"a":19,"kda_score":2.4,"t":0,"carry":0,"id":44,"d":8},{"mvp":0,"gpm":0,"mk10m":0,"champion":{"display_name":"末日使者","name":"Fiddlesticks","title":"费德提克","id":9},"win":0,"k":0,"win_rate":0,"l":0,"times":4,"ddpm":0,"a":0,"kda_score":0,"t":0,"carry":0,"id":9,"d":0},{"mvp":0,"gpm":259,"mk10m":13,"champion":{"display_name":"荆棘之兴","name":"Zyra","title":"婕拉","id":143},"win":1,"k":2,"win_rate":25,"l":null,"times":4,"ddpm":278,"a":7,"kda_score":1.3,"t":0,"carry":0,"id":143,"d":6},{"mvp":0,"gpm":334,"mk10m":11,"champion":{"display_name":"正义巨像","name":"Galio","title":"加里奥","id":3},"win":2,"k":4,"win_rate":66,"l":null,"times":3,"ddpm":264,"a":8,"kda_score":4,"t":0,"carry":0,"id":3,"d":2},{"mvp":0,"gpm":294,"mk10m":26,"champion":{"display_name":"虚空遁地兽","name":"RekSai","title":"雷克塞","id":421},"win":1,"k":2,"win_rate":33,"l":null,"times":3,"ddpm":315,"a":8,"kda_score":1.4,"t":0,"carry":0,"id":421,"d":6},{"mvp":0,"gpm":324,"mk10m":38,"champion":{"display_name":"酒桶","name":"Gragas","title":"古拉加斯","id":79},"win":1,"k":3,"win_rate":33,"l":null,"times":3,"ddpm":374,"a":8.5,"kda_score":2.1,"t":0,"carry":0,"id":79,"d":4.5},{"mvp":0,"gpm":292,"mk10m":34,"champion":{"display_name":"德玛西亚之翼","name":"Quinn","title":"奎因","id":133},"win":2,"k":11,"win_rate":100,"l":null,"times":2,"ddpm":600,"a":8.5,"kda_score":2.2,"t":0,"carry":0,"id":133,"d":8},{"mvp":0,"gpm":388,"mk10m":51,"champion":{"display_name":"卡牌大师","name":"TwistedFate","title":"崔斯特","id":4},"win":1,"k":9,"win_rate":50,"l":null,"times":2,"ddpm":842,"a":13,"kda_score":2,"t":0,"carry":0,"id":4,"d":10},{"mvp":0,"gpm":304,"mk10m":44,"champion":{"display_name":"冰霜女巫","name":"Lissandra","title":"丽桑卓","id":127},"win":0,"k":4,"win_rate":0,"l":null,"times":2,"ddpm":494,"a":9,"kda_score":1.3,"t":0,"carry":0,"id":127,"d":9},{"mvp":0,"gpm":229,"mk10m":5,"champion":{"display_name":"仙灵女巫","name":"Lulu","title":"璐璐","id":117},"win":0,"k":0,"win_rate":0,"l":null,"times":2,"ddpm":185,"a":6,"kda_score":0.5,"t":0,"carry":0,"id":117,"d":11},{"mvp":0,"gpm":299,"mk10m":42,"champion":{"display_name":"诡术妖姬","name":"Leblanc","title":"乐芙兰","id":7},"win":0,"k":6,"win_rate":0,"l":null,"times":2,"ddpm":593,"a":6,"kda_score":2,"t":0,"carry":0,"id":7,"d":5},{"mvp":0,"gpm":0,"mk10m":0,"champion":{"display_name":"光辉女郎","name":"Lux","title":"拉克丝","id":99},"win":1,"k":0,"win_rate":50,"l":0,"times":2,"ddpm":0,"a":0,"kda_score":0,"t":0,"carry":0,"id":99,"d":0},{"mvp":1,"gpm":391,"mk10m":24,"champion":{"display_name":"暮光之眼","name":"Shen","title":"慎","id":98},"win":2,"k":5,"win_rate":100,"l":null,"times":2,"ddpm":302,"a":14,"kda_score":6.3,"t":0,"carry":0,"id":98,"d":2},{"mvp":0,"gpm":372,"mk10m":20,"champion":{"display_name":"无极剑圣","name":"MasterYi","title":"易","id":11},"win":2,"k":4,"win_rate":100,"l":null,"times":2,"ddpm":314,"a":10,"kda_score":2.3,"t":0,"carry":0,"id":11,"d":5},{"mvp":0,"gpm":0,"mk10m":0,"champion":{"display_name":"符文法师","name":"Ryze","title":"瑞兹","id":13},"win":1,"k":0,"win_rate":50,"l":0,"times":2,"ddpm":0,"a":0,"kda_score":0,"t":0,"carry":0,"id":13,"d":0},{"mvp":0,"gpm":335,"mk10m":0,"champion":{"display_name":"英勇投弹手","name":"Corki","title":"库奇","id":42},"win":2,"k":2,"win_rate":100,"l":null,"times":2,"ddpm":541,"a":18,"kda_score":4,"t":0,"carry":0,"id":42,"d":4},{"mvp":0,"gpm":0,"mk10m":0,"champion":{"display_name":"海洋之灾","name":"Gangplank","title":"普朗克","id":41},"win":1,"k":0,"win_rate":50,"l":0,"times":2,"ddpm":0,"a":0,"kda_score":0,"t":0,"carry":0,"id":41,"d":0},{"mvp":0,"gpm":263,"mk10m":7,"champion":{"display_name":"黑暗之女","name":"Annie","title":"安妮","id":1},"win":0,"k":2,"win_rate":0,"l":null,"times":2,"ddpm":327,"a":14,"kda_score":1.5,"t":0,"carry":0,"id":1,"d":10},{"mvp":0,"gpm":282,"mk10m":23,"champion":{"display_name":"德邦总管","name":"XinZhao","title":"赵信","id":5},"win":0,"k":3,"win_rate":0,"l":null,"times":2,"ddpm":308,"a":4,"kda_score":0.9,"t":0,"carry":0,"id":5,"d":7},{"mvp":0,"gpm":0,"mk10m":0,"champion":{"display_name":"永猎双子","name":"Kindred","title":"千珏","id":203},"win":0,"k":0,"win_rate":0,"l":0,"times":2,"ddpm":0,"a":0,"kda_score":0,"t":0,"carry":0,"id":203,"d":0},{"mvp":0,"gpm":383,"mk10m":48,"champion":{"display_name":"炼金术士","name":"Singed","title":"辛吉德","id":27},"win":1,"k":6,"win_rate":100,"l":null,"times":1,"ddpm":821,"a":11,"kda_score":2.1,"t":0,"carry":0,"id":27,"d":7},{"mvp":0,"gpm":0,"mk10m":0,"champion":{"display_name":"诺克萨斯之手","name":"Darius","title":"德莱厄斯","id":122},"win":1,"k":0,"win_rate":100,"l":0,"times":1,"ddpm":0,"a":0,"kda_score":0,"t":0,"carry":0,"id":122,"d":0},{"mvp":0,"gpm":345,"mk10m":41,"champion":{"display_name":"远古巫灵","name":"Xerath","title":"泽拉斯","id":101},"win":1,"k":3,"win_rate":100,"l":null,"times":1,"ddpm":636,"a":18,"kda_score":4.2,"t":0,"carry":0,"id":101,"d":4},{"mvp":0,"gpm":0,"mk10m":0,"champion":{"display_name":"死亡颂唱者","name":"Karthus","title":"卡尔萨斯","id":30},"win":0,"k":0,"win_rate":0,"l":0,"times":1,"ddpm":0,"a":0,"kda_score":0,"t":0,"carry":0,"id":30,"d":0},{"mvp":0,"gpm":242,"mk10m":2,"champion":{"display_name":"琴瑟仙女","name":"Sona","title":"娑娜","id":37},"win":0,"k":0,"win_rate":0,"l":null,"times":1,"ddpm":322,"a":17,"kda_score":1.4,"t":0,"carry":0,"id":37,"d":11},{"mvp":0,"gpm":280,"mk10m":31,"champion":{"display_name":"恶魔小丑","name":"Shaco","title":"萨科","id":35},"win":0,"k":2,"win_rate":0,"l":null,"times":1,"ddpm":146,"a":2,"kda_score":2,"t":0,"carry":0,"id":35,"d":1},{"mvp":0,"gpm":294,"mk10m":53,"champion":{"display_name":"冰晶凤凰","name":"Anivia","title":"艾尼维亚","id":34},"win":0,"k":3,"win_rate":0,"l":null,"times":1,"ddpm":658,"a":7,"kda_score":2,"t":0,"carry":0,"id":34,"d":4},{"mvp":0,"gpm":311,"mk10m":30,"champion":{"display_name":"机械公敌","name":"Rumble","title":"兰博","id":68},"win":0,"k":2,"win_rate":0,"l":0,"times":1,"ddpm":425,"a":3,"kda_score":0.7,"t":0,"carry":0,"id":68,"d":6},{"mvp":0,"gpm":338,"mk10m":43,"champion":{"display_name":"兽灵行者","name":"Udyr","title":"乌迪尔","id":77},"win":1,"k":6,"win_rate":100,"l":null,"times":1,"ddpm":483,"a":14,"kda_score":2.2,"t":0,"carry":0,"id":77,"d":8},{"mvp":0,"gpm":0,"mk10m":0,"champion":{"display_name":"狂野女猎手","name":"Nidalee","title":"奈德丽","id":76},"win":0,"k":0,"win_rate":0,"l":0,"times":1,"ddpm":0,"a":0,"kda_score":0,"t":0,"carry":0,"id":76,"d":0}]
         * total_leave_bot : 0
         * total_game : 3769
         * gzpy : dx9
         */

        private int total_lose_normal;
        private int total_leave_aram;
        private String last_modified_ranked;
        private double win_rate;
        private int rank;
        private StatPerfBean stat_perf;
        private int total_lose_bot;
        private int win_ratio_score;
        private long user_id;
        private GameZoneBean game_zone;
        private int win_battle_score;
        private FormattedRankedHistoryBean formatted_ranked_history;
        private String pn;
        private int total_lose_aram;
        private int total_win_normal;
        private int total_win_bot;
        private int total_win_aram;
        private TierRankBean tier_rank;
        private String last_modified;
        private int tier;
        private String last_modified_bot;
        private int league_points;
        private int icon;
        private int elo_score;
        private int box_score;
        private String last_modified_aram;
        private int like;
        private int unlike;
        private int level;
        private String last_modified_normal;
        private int total_leave_normal;
        private int total_leave_bot;
        private int total_game;
        private String gzpy;
        private List<GameRecentListBean> game_recent_list;
        private List<ChampionPerformanceListBean> champion_performance_list;

        public int getTotal_lose_normal()
        {
            return total_lose_normal;
        }

        public void setTotal_lose_normal(int total_lose_normal)
        {
            this.total_lose_normal = total_lose_normal;
        }

        public int getTotal_leave_aram()
        {
            return total_leave_aram;
        }

        public void setTotal_leave_aram(int total_leave_aram)
        {
            this.total_leave_aram = total_leave_aram;
        }

        public String getLast_modified_ranked()
        {
            return last_modified_ranked;
        }

        public void setLast_modified_ranked(String last_modified_ranked)
        {
            this.last_modified_ranked = last_modified_ranked;
        }

        public double getWin_rate()
        {
            return win_rate;
        }

        public void setWin_rate(double win_rate)
        {
            this.win_rate = win_rate;
        }

        public int getRank()
        {
            return rank;
        }

        public void setRank(int rank)
        {
            this.rank = rank;
        }

        public StatPerfBean getStat_perf()
        {
            return stat_perf;
        }

        public void setStat_perf(StatPerfBean stat_perf)
        {
            this.stat_perf = stat_perf;
        }

        public int getTotal_lose_bot()
        {
            return total_lose_bot;
        }

        public void setTotal_lose_bot(int total_lose_bot)
        {
            this.total_lose_bot = total_lose_bot;
        }

        public int getWin_ratio_score()
        {
            return win_ratio_score;
        }

        public void setWin_ratio_score(int win_ratio_score)
        {
            this.win_ratio_score = win_ratio_score;
        }

        public long getUser_id()
        {
            return user_id;
        }

        public void setUser_id(long user_id)
        {
            this.user_id = user_id;
        }

        public GameZoneBean getGame_zone()
        {
            return game_zone;
        }

        public void setGame_zone(GameZoneBean game_zone)
        {
            this.game_zone = game_zone;
        }

        public int getWin_battle_score()
        {
            return win_battle_score;
        }

        public void setWin_battle_score(int win_battle_score)
        {
            this.win_battle_score = win_battle_score;
        }

        public FormattedRankedHistoryBean getFormatted_ranked_history()
        {
            return formatted_ranked_history;
        }

        public void setFormatted_ranked_history(FormattedRankedHistoryBean formatted_ranked_history)
        {
            this.formatted_ranked_history = formatted_ranked_history;
        }

        public String getPn()
        {
            return pn;
        }

        public void setPn(String pn)
        {
            this.pn = pn;
        }

        public int getTotal_lose_aram()
        {
            return total_lose_aram;
        }

        public void setTotal_lose_aram(int total_lose_aram)
        {
            this.total_lose_aram = total_lose_aram;
        }

        public int getTotal_win_normal()
        {
            return total_win_normal;
        }

        public void setTotal_win_normal(int total_win_normal)
        {
            this.total_win_normal = total_win_normal;
        }

        public int getTotal_win_bot()
        {
            return total_win_bot;
        }

        public void setTotal_win_bot(int total_win_bot)
        {
            this.total_win_bot = total_win_bot;
        }

        public int getTotal_win_aram()
        {
            return total_win_aram;
        }

        public void setTotal_win_aram(int total_win_aram)
        {
            this.total_win_aram = total_win_aram;
        }

        public TierRankBean getTier_rank()
        {
            return tier_rank;
        }

        public void setTier_rank(TierRankBean tier_rank)
        {
            this.tier_rank = tier_rank;
        }

        public String getLast_modified()
        {
            return last_modified;
        }

        public void setLast_modified(String last_modified)
        {
            this.last_modified = last_modified;
        }

        public int getTier()
        {
            return tier;
        }

        public void setTier(int tier)
        {
            this.tier = tier;
        }

        public String getLast_modified_bot()
        {
            return last_modified_bot;
        }

        public void setLast_modified_bot(String last_modified_bot)
        {
            this.last_modified_bot = last_modified_bot;
        }

        public int getLeague_points()
        {
            return league_points;
        }

        public void setLeague_points(int league_points)
        {
            this.league_points = league_points;
        }

        public int getIcon()
        {
            return icon;
        }

        public void setIcon(int icon)
        {
            this.icon = icon;
        }

        public int getElo_score()
        {
            return elo_score;
        }

        public void setElo_score(int elo_score)
        {
            this.elo_score = elo_score;
        }

        public int getBox_score()
        {
            return box_score;
        }

        public void setBox_score(int box_score)
        {
            this.box_score = box_score;
        }

        public String getLast_modified_aram()
        {
            return last_modified_aram;
        }

        public void setLast_modified_aram(String last_modified_aram)
        {
            this.last_modified_aram = last_modified_aram;
        }

        public int getLike()
        {
            return like;
        }

        public void setLike(int like)
        {
            this.like = like;
        }

        public int getUnlike()
        {
            return unlike;
        }

        public void setUnlike(int unlike)
        {
            this.unlike = unlike;
        }

        public int getLevel()
        {
            return level;
        }

        public void setLevel(int level)
        {
            this.level = level;
        }

        public String getLast_modified_normal()
        {
            return last_modified_normal;
        }

        public void setLast_modified_normal(String last_modified_normal)
        {
            this.last_modified_normal = last_modified_normal;
        }

        public int getTotal_leave_normal()
        {
            return total_leave_normal;
        }

        public void setTotal_leave_normal(int total_leave_normal)
        {
            this.total_leave_normal = total_leave_normal;
        }

        public int getTotal_leave_bot()
        {
            return total_leave_bot;
        }

        public void setTotal_leave_bot(int total_leave_bot)
        {
            this.total_leave_bot = total_leave_bot;
        }

        public int getTotal_game()
        {
            return total_game;
        }

        public void setTotal_game(int total_game)
        {
            this.total_game = total_game;
        }

        public String getGzpy()
        {
            return gzpy;
        }

        public void setGzpy(String gzpy)
        {
            this.gzpy = gzpy;
        }

        public List<GameRecentListBean> getGame_recent_list()
        {
            return game_recent_list;
        }

        public void setGame_recent_list(List<GameRecentListBean> game_recent_list)
        {
            this.game_recent_list = game_recent_list;
        }

        public List<ChampionPerformanceListBean> getChampion_performance_list()
        {
            return champion_performance_list;
        }

        public void setChampion_performance_list(List<ChampionPerformanceListBean> champion_performance_list)
        {
            this.champion_performance_list = champion_performance_list;
        }

        public static class StatPerfBean
        {
            /**
             * position : {"support":0,"top":0,"jungler":0,"adc":0,"mid":0}
             * kda : {"quadra_kills":0,"total_k":0,"total_win":0,"total_lose":0,"total_a":0,"total_d":0,"triple_kills":0,"penta_kills":0,"god_like_num":0}
             * total_game : 0
             */

            private PositionBean position;
            private KdaBean kda;
            private int total_game;

            public PositionBean getPosition()
            {
                return position;
            }

            public void setPosition(PositionBean position)
            {
                this.position = position;
            }

            public KdaBean getKda()
            {
                return kda;
            }

            public void setKda(KdaBean kda)
            {
                this.kda = kda;
            }

            public int getTotal_game()
            {
                return total_game;
            }

            public void setTotal_game(int total_game)
            {
                this.total_game = total_game;
            }

            public static class PositionBean
            {
                /**
                 * support : 0
                 * top : 0
                 * jungler : 0
                 * adc : 0
                 * mid : 0
                 */

                private int support;
                private int top;
                private int jungler;
                private int adc;
                private int mid;

                public int getSupport()
                {
                    return support;
                }

                public void setSupport(int support)
                {
                    this.support = support;
                }

                public int getTop()
                {
                    return top;
                }

                public void setTop(int top)
                {
                    this.top = top;
                }

                public int getJungler()
                {
                    return jungler;
                }

                public void setJungler(int jungler)
                {
                    this.jungler = jungler;
                }

                public int getAdc()
                {
                    return adc;
                }

                public void setAdc(int adc)
                {
                    this.adc = adc;
                }

                public int getMid()
                {
                    return mid;
                }

                public void setMid(int mid)
                {
                    this.mid = mid;
                }
            }

            public static class KdaBean
            {
                /**
                 * quadra_kills : 0
                 * total_k : 0
                 * total_win : 0
                 * total_lose : 0
                 * total_a : 0
                 * total_d : 0
                 * triple_kills : 0
                 * penta_kills : 0
                 * god_like_num : 0
                 */

                private int quadra_kills;
                private int total_k;
                private int total_win;
                private int total_lose;
                private int total_a;
                private int total_d;
                private int triple_kills;
                private int penta_kills;
                private int god_like_num;

                public int getQuadra_kills()
                {
                    return quadra_kills;
                }

                public void setQuadra_kills(int quadra_kills)
                {
                    this.quadra_kills = quadra_kills;
                }

                public int getTotal_k()
                {
                    return total_k;
                }

                public void setTotal_k(int total_k)
                {
                    this.total_k = total_k;
                }

                public int getTotal_win()
                {
                    return total_win;
                }

                public void setTotal_win(int total_win)
                {
                    this.total_win = total_win;
                }

                public int getTotal_lose()
                {
                    return total_lose;
                }

                public void setTotal_lose(int total_lose)
                {
                    this.total_lose = total_lose;
                }

                public int getTotal_a()
                {
                    return total_a;
                }

                public void setTotal_a(int total_a)
                {
                    this.total_a = total_a;
                }

                public int getTotal_d()
                {
                    return total_d;
                }

                public void setTotal_d(int total_d)
                {
                    this.total_d = total_d;
                }

                public int getTriple_kills()
                {
                    return triple_kills;
                }

                public void setTriple_kills(int triple_kills)
                {
                    this.triple_kills = triple_kills;
                }

                public int getPenta_kills()
                {
                    return penta_kills;
                }

                public void setPenta_kills(int penta_kills)
                {
                    this.penta_kills = penta_kills;
                }

                public int getGod_like_num()
                {
                    return god_like_num;
                }

                public void setGod_like_num(int god_like_num)
                {
                    this.god_like_num = god_like_num;
                }
            }
        }

        public static class GameZoneBean
        {
            /**
             * pinyin : dx9
             * area_id : 13
             * server_name : 电信九
             * alias : 裁决之地
             */

            private String pinyin;
            private int area_id;
            private String server_name;
            private String alias;

            public String getPinyin()
            {
                return pinyin;
            }

            public void setPinyin(String pinyin)
            {
                this.pinyin = pinyin;
            }

            public int getArea_id()
            {
                return area_id;
            }

            public void setArea_id(int area_id)
            {
                this.area_id = area_id;
            }

            public String getServer_name()
            {
                return server_name;
            }

            public void setServer_name(String server_name)
            {
                this.server_name = server_name;
            }

            public String getAlias()
            {
                return alias;
            }

            public void setAlias(String alias)
            {
                this.alias = alias;
            }
        }

        public static class FormattedRankedHistoryBean
        {
            /**
             * s3 : {"le":0,"lo":0,"r_zh":"-","p":0,"r":0,"t":0,"w":0,"t_zh":"无段位"}
             * last_season_name : flex_sr
             * s7 : {"le":1,"lo":69,"r_zh":"I","p":0,"r":1,"t":2,"w":78,"t_zh":"白银"}
             * s6 : {"le":0,"lo":1,"r_zh":"II","p":31,"r":2,"t":3,"w":232,"t_zh":"黄金"}
             * s5 : {"lo":0,"t_zh":"-","w":278,"r_zh":"-"}
             * s4 : {"lo":288,"t_zh":"-","w":295,"r_zh":"-"}
             * flex_sr : {"le":0,"lo":0,"r_zh":"V","p":0,"r":5,"t":3,"w":32,"t_zh":"黄金"}
             */

            private S3Bean s3;
            private String last_season_name;
            private S7Bean s7;
            private S6Bean s6;
            private S5Bean s5;
            private S4Bean s4;
            private FlexSrBean flex_sr;

            public S3Bean getS3()
            {
                return s3;
            }

            public void setS3(S3Bean s3)
            {
                this.s3 = s3;
            }

            public String getLast_season_name()
            {
                return last_season_name;
            }

            public void setLast_season_name(String last_season_name)
            {
                this.last_season_name = last_season_name;
            }

            public S7Bean getS7()
            {
                return s7;
            }

            public void setS7(S7Bean s7)
            {
                this.s7 = s7;
            }

            public S6Bean getS6()
            {
                return s6;
            }

            public void setS6(S6Bean s6)
            {
                this.s6 = s6;
            }

            public S5Bean getS5()
            {
                return s5;
            }

            public void setS5(S5Bean s5)
            {
                this.s5 = s5;
            }

            public S4Bean getS4()
            {
                return s4;
            }

            public void setS4(S4Bean s4)
            {
                this.s4 = s4;
            }

            public FlexSrBean getFlex_sr()
            {
                return flex_sr;
            }

            public void setFlex_sr(FlexSrBean flex_sr)
            {
                this.flex_sr = flex_sr;
            }

            public static class S3Bean
            {
                /**
                 * le : 0
                 * lo : 0
                 * r_zh : -
                 * p : 0
                 * r : 0
                 * t : 0
                 * w : 0
                 * t_zh : 无段位
                 */

                private int le;
                private int lo;
                private String r_zh;
                private int p;
                private int r;
                private int t;
                private int w;
                private String t_zh;

                public int getLe()
                {
                    return le;
                }

                public void setLe(int le)
                {
                    this.le = le;
                }

                public int getLo()
                {
                    return lo;
                }

                public void setLo(int lo)
                {
                    this.lo = lo;
                }

                public String getR_zh()
                {
                    return r_zh;
                }

                public void setR_zh(String r_zh)
                {
                    this.r_zh = r_zh;
                }

                public int getP()
                {
                    return p;
                }

                public void setP(int p)
                {
                    this.p = p;
                }

                public int getR()
                {
                    return r;
                }

                public void setR(int r)
                {
                    this.r = r;
                }

                public int getT()
                {
                    return t;
                }

                public void setT(int t)
                {
                    this.t = t;
                }

                public int getW()
                {
                    return w;
                }

                public void setW(int w)
                {
                    this.w = w;
                }

                public String getT_zh()
                {
                    return t_zh;
                }

                public void setT_zh(String t_zh)
                {
                    this.t_zh = t_zh;
                }
            }

            public static class S7Bean
            {
                /**
                 * le : 1
                 * lo : 69
                 * r_zh : I
                 * p : 0
                 * r : 1
                 * t : 2
                 * w : 78
                 * t_zh : 白银
                 */

                private int le;
                private int lo;
                private String r_zh;
                private int p;
                private int r;
                private int t;
                private int w;
                private String t_zh;

                public int getLe()
                {
                    return le;
                }

                public void setLe(int le)
                {
                    this.le = le;
                }

                public int getLo()
                {
                    return lo;
                }

                public void setLo(int lo)
                {
                    this.lo = lo;
                }

                public String getR_zh()
                {
                    return r_zh;
                }

                public void setR_zh(String r_zh)
                {
                    this.r_zh = r_zh;
                }

                public int getP()
                {
                    return p;
                }

                public void setP(int p)
                {
                    this.p = p;
                }

                public int getR()
                {
                    return r;
                }

                public void setR(int r)
                {
                    this.r = r;
                }

                public int getT()
                {
                    return t;
                }

                public void setT(int t)
                {
                    this.t = t;
                }

                public int getW()
                {
                    return w;
                }

                public void setW(int w)
                {
                    this.w = w;
                }

                public String getT_zh()
                {
                    return t_zh;
                }

                public void setT_zh(String t_zh)
                {
                    this.t_zh = t_zh;
                }
            }

            public static class S6Bean
            {
                /**
                 * le : 0
                 * lo : 1
                 * r_zh : II
                 * p : 31
                 * r : 2
                 * t : 3
                 * w : 232
                 * t_zh : 黄金
                 */

                private int le;
                private int lo;
                private String r_zh;
                private int p;
                private int r;
                private int t;
                private int w;
                private String t_zh;

                public int getLe()
                {
                    return le;
                }

                public void setLe(int le)
                {
                    this.le = le;
                }

                public int getLo()
                {
                    return lo;
                }

                public void setLo(int lo)
                {
                    this.lo = lo;
                }

                public String getR_zh()
                {
                    return r_zh;
                }

                public void setR_zh(String r_zh)
                {
                    this.r_zh = r_zh;
                }

                public int getP()
                {
                    return p;
                }

                public void setP(int p)
                {
                    this.p = p;
                }

                public int getR()
                {
                    return r;
                }

                public void setR(int r)
                {
                    this.r = r;
                }

                public int getT()
                {
                    return t;
                }

                public void setT(int t)
                {
                    this.t = t;
                }

                public int getW()
                {
                    return w;
                }

                public void setW(int w)
                {
                    this.w = w;
                }

                public String getT_zh()
                {
                    return t_zh;
                }

                public void setT_zh(String t_zh)
                {
                    this.t_zh = t_zh;
                }
            }

            public static class S5Bean
            {
                /**
                 * lo : 0
                 * t_zh : -
                 * w : 278
                 * r_zh : -
                 */

                private int lo;
                private String t_zh;
                private int w;
                private String r_zh;

                public int getLo()
                {
                    return lo;
                }

                public void setLo(int lo)
                {
                    this.lo = lo;
                }

                public String getT_zh()
                {
                    return t_zh;
                }

                public void setT_zh(String t_zh)
                {
                    this.t_zh = t_zh;
                }

                public int getW()
                {
                    return w;
                }

                public void setW(int w)
                {
                    this.w = w;
                }

                public String getR_zh()
                {
                    return r_zh;
                }

                public void setR_zh(String r_zh)
                {
                    this.r_zh = r_zh;
                }
            }

            public static class S4Bean
            {
                /**
                 * lo : 288
                 * t_zh : -
                 * w : 295
                 * r_zh : -
                 */

                private int lo;
                private String t_zh;
                private int w;
                private String r_zh;

                public int getLo()
                {
                    return lo;
                }

                public void setLo(int lo)
                {
                    this.lo = lo;
                }

                public String getT_zh()
                {
                    return t_zh;
                }

                public void setT_zh(String t_zh)
                {
                    this.t_zh = t_zh;
                }

                public int getW()
                {
                    return w;
                }

                public void setW(int w)
                {
                    this.w = w;
                }

                public String getR_zh()
                {
                    return r_zh;
                }

                public void setR_zh(String r_zh)
                {
                    this.r_zh = r_zh;
                }
            }

            public static class FlexSrBean
            {
                /**
                 * le : 0
                 * lo : 0
                 * r_zh : V
                 * p : 0
                 * r : 5
                 * t : 3
                 * w : 32
                 * t_zh : 黄金
                 */

                private int le;
                private int lo;
                private String r_zh;
                private int p;
                private int r;
                private int t;
                private int w;
                private String t_zh;

                public int getLe()
                {
                    return le;
                }

                public void setLe(int le)
                {
                    this.le = le;
                }

                public int getLo()
                {
                    return lo;
                }

                public void setLo(int lo)
                {
                    this.lo = lo;
                }

                public String getR_zh()
                {
                    return r_zh;
                }

                public void setR_zh(String r_zh)
                {
                    this.r_zh = r_zh;
                }

                public int getP()
                {
                    return p;
                }

                public void setP(int p)
                {
                    this.p = p;
                }

                public int getR()
                {
                    return r;
                }

                public void setR(int r)
                {
                    this.r = r;
                }

                public int getT()
                {
                    return t;
                }

                public void setT(int t)
                {
                    this.t = t;
                }

                public int getW()
                {
                    return w;
                }

                public void setW(int w)
                {
                    this.w = w;
                }

                public String getT_zh()
                {
                    return t_zh;
                }

                public void setT_zh(String t_zh)
                {
                    this.t_zh = t_zh;
                }
            }
        }

        public static class TierRankBean
        {
            /**
             * tier : {"name_cn":"黄金","const":3,"name":"gold","full_name_cn":"荣耀黄金"}
             * url_img : http://static.lolbox.duowan.com/images/rank/3_50x50.png
             * rank : {"const":5,"name_cn":null,"name":"V"}
             * league_points : 0
             */

            private TierBean tier;
            private String url_img;
            private RankBean rank;
            private int league_points;

            public TierBean getTier()
            {
                return tier;
            }

            public void setTier(TierBean tier)
            {
                this.tier = tier;
            }

            public String getUrl_img()
            {
                return url_img;
            }

            public void setUrl_img(String url_img)
            {
                this.url_img = url_img;
            }

            public RankBean getRank()
            {
                return rank;
            }

            public void setRank(RankBean rank)
            {
                this.rank = rank;
            }

            public int getLeague_points()
            {
                return league_points;
            }

            public void setLeague_points(int league_points)
            {
                this.league_points = league_points;
            }

            public static class TierBean
            {
                /**
                 * name_cn : 黄金
                 * const : 3
                 * name : gold
                 * full_name_cn : 荣耀黄金
                 */

                private String name_cn;
                @SerializedName("const")
                private int constX;
                private String name;
                private String full_name_cn;

                public String getName_cn()
                {
                    return name_cn;
                }

                public void setName_cn(String name_cn)
                {
                    this.name_cn = name_cn;
                }

                public int getConstX()
                {
                    return constX;
                }

                public void setConstX(int constX)
                {
                    this.constX = constX;
                }

                public String getName()
                {
                    return name;
                }

                public void setName(String name)
                {
                    this.name = name;
                }

                public String getFull_name_cn()
                {
                    return full_name_cn;
                }

                public void setFull_name_cn(String full_name_cn)
                {
                    this.full_name_cn = full_name_cn;
                }
            }

            public static class RankBean
            {
                /**
                 * const : 5
                 * name_cn : null
                 * name : V
                 */

                @SerializedName("const")
                private int constX;
                private Object name_cn;
                private String name;

                public int getConstX()
                {
                    return constX;
                }

                public void setConstX(int constX)
                {
                    this.constX = constX;
                }

                public Object getName_cn()
                {
                    return name_cn;
                }

                public void setName_cn(Object name_cn)
                {
                    this.name_cn = name_cn;
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

        public static class GameRecentListBean
        {
            /**
             * user_id : 2949347757
             * champion : {"display_name":"皮城女警","name":"Caitlyn","title":"凯特琳","id":51}
             * created : 2017-12-14T14:48:11
             * game_type : {"const":3,"name_cn":"匹配赛"}
             * champion_id : 51
             * flag_mvp_carry : 0
             * collect : false
             * game_zone : {"pinyin":"dx9","area_id":13,"server_name":"电信九","alias":"裁决之地"}
             * collected : false
             * game_id : 1285289772
             * spells_in_s :
             * game_type_const : 3
             * battle_result : true
             */

            private long user_id;
            private ChampionBean champion;
            private String created;
            private GameTypeBean game_type;
            private int champion_id;
            private int flag_mvp_carry;
            private boolean collect;
            private GameZoneBeanX game_zone;
            private boolean collected;
            private long game_id;
            private String spells_in_s;
            private int game_type_const;
            private boolean battle_result;

            public long getUser_id()
            {
                return user_id;
            }

            public void setUser_id(long user_id)
            {
                this.user_id = user_id;
            }

            public ChampionBean getChampion()
            {
                return champion;
            }

            public void setChampion(ChampionBean champion)
            {
                this.champion = champion;
            }

            public String getCreated()
            {
                return created;
            }

            public void setCreated(String created)
            {
                this.created = created;
            }

            public GameTypeBean getGame_type()
            {
                return game_type;
            }

            public void setGame_type(GameTypeBean game_type)
            {
                this.game_type = game_type;
            }

            public int getChampion_id()
            {
                return champion_id;
            }

            public void setChampion_id(int champion_id)
            {
                this.champion_id = champion_id;
            }

            public int getFlag_mvp_carry()
            {
                return flag_mvp_carry;
            }

            public void setFlag_mvp_carry(int flag_mvp_carry)
            {
                this.flag_mvp_carry = flag_mvp_carry;
            }

            public boolean isCollect()
            {
                return collect;
            }

            public void setCollect(boolean collect)
            {
                this.collect = collect;
            }

            public GameZoneBeanX getGame_zone()
            {
                return game_zone;
            }

            public void setGame_zone(GameZoneBeanX game_zone)
            {
                this.game_zone = game_zone;
            }

            public boolean isCollected()
            {
                return collected;
            }

            public void setCollected(boolean collected)
            {
                this.collected = collected;
            }

            public long getGame_id()
            {
                return game_id;
            }

            public void setGame_id(long game_id)
            {
                this.game_id = game_id;
            }

            public String getSpells_in_s()
            {
                return spells_in_s;
            }

            public void setSpells_in_s(String spells_in_s)
            {
                this.spells_in_s = spells_in_s;
            }

            public int getGame_type_const()
            {
                return game_type_const;
            }

            public void setGame_type_const(int game_type_const)
            {
                this.game_type_const = game_type_const;
            }

            public boolean isBattle_result()
            {
                return battle_result;
            }

            public void setBattle_result(boolean battle_result)
            {
                this.battle_result = battle_result;
            }

            public static class ChampionBean
            {
                /**
                 * display_name : 皮城女警
                 * name : Caitlyn
                 * title : 凯特琳
                 * id : 51
                 */

                private String display_name;
                private String name;
                private String title;
                private int id;

                public String getDisplay_name()
                {
                    return display_name;
                }

                public void setDisplay_name(String display_name)
                {
                    this.display_name = display_name;
                }

                public String getName()
                {
                    return name;
                }

                public void setName(String name)
                {
                    this.name = name;
                }

                public String getTitle()
                {
                    return title;
                }

                public void setTitle(String title)
                {
                    this.title = title;
                }

                public int getId()
                {
                    return id;
                }

                public void setId(int id)
                {
                    this.id = id;
                }
            }

            public static class GameTypeBean
            {
                /**
                 * const : 3
                 * name_cn : 匹配赛
                 */

                @SerializedName("const")
                private int constX;
                private String name_cn;

                public int getConstX()
                {
                    return constX;
                }

                public void setConstX(int constX)
                {
                    this.constX = constX;
                }

                public String getName_cn()
                {
                    return name_cn;
                }

                public void setName_cn(String name_cn)
                {
                    this.name_cn = name_cn;
                }
            }

            public static class GameZoneBeanX
            {
                /**
                 * pinyin : dx9
                 * area_id : 13
                 * server_name : 电信九
                 * alias : 裁决之地
                 */

                private String pinyin;
                private int area_id;
                private String server_name;
                private String alias;

                public String getPinyin()
                {
                    return pinyin;
                }

                public void setPinyin(String pinyin)
                {
                    this.pinyin = pinyin;
                }

                public int getArea_id()
                {
                    return area_id;
                }

                public void setArea_id(int area_id)
                {
                    this.area_id = area_id;
                }

                public String getServer_name()
                {
                    return server_name;
                }

                public void setServer_name(String server_name)
                {
                    this.server_name = server_name;
                }

                public String getAlias()
                {
                    return alias;
                }

                public void setAlias(String alias)
                {
                    this.alias = alias;
                }
            }
        }

        public static class ChampionPerformanceListBean
        {
            /**
             * mvp : 39
             * gpm : 372
             * mk10m : 45
             * champion : {"display_name":"皮城女警","name":"Caitlyn","title":"凯特琳","id":51}
             * d : 5
             * win : 166
             * k : 7.4
             * win_rate : 55
             * l : 5
             * times : 300
             * ddpm : 722
             * a : 9
             * kda_score : 2.7
             * carry : 3
             * id : 51
             * t : 1513262891
             */

            private double mvp;
            private double gpm;
            private String mk10m;
            private ChampionBeanX champion;
            private double d;
            private double win;
            private double k;
            private String win_rate;
            private double l;
            private double times;
            private double ddpm;
            private double a;
            private double kda_score;
            private double carry;
            private double id;
            private double t;

            public double getMvp()
            {
                return mvp;
            }

            public void setMvp(double mvp)
            {
                this.mvp = mvp;
            }

            public double getGpm()
            {
                return gpm;
            }

            public void setGpm(double gpm)
            {
                this.gpm = gpm;
            }

            public String getMk10m()
            {
                return mk10m;
            }

            public void setMk10m(String mk10m)
            {
                this.mk10m = mk10m;
            }

            public ChampionBeanX getChampion()
            {
                return champion;
            }

            public void setChampion(ChampionBeanX champion)
            {
                this.champion = champion;
            }

            public double getD()
            {
                return d;
            }

            public void setD(double d)
            {
                this.d = d;
            }

            public double getWin()
            {
                return win;
            }

            public void setWin(double win)
            {
                this.win = win;
            }

            public double getK()
            {
                return k;
            }

            public void setK(double k)
            {
                this.k = k;
            }

            public String getWin_rate()
            {
                return win_rate;
            }

            public void setWin_rate(String win_rate)
            {
                this.win_rate = win_rate;
            }

            public double getL()
            {
                return l;
            }

            public void setL(double l)
            {
                this.l = l;
            }

            public double getTimes()
            {
                return times;
            }

            public void setTimes(int times)
            {
                this.times = times;
            }

            public double getDdpm()
            {
                return ddpm;
            }

            public void setDdpm(int ddpm)
            {
                this.ddpm = ddpm;
            }

            public double getA()
            {
                return a;
            }

            public void setA(double a)
            {
                this.a = a;
            }

            public double getKda_score()
            {
                return kda_score;
            }

            public void setKda_score(double kda_score)
            {
                this.kda_score = kda_score;
            }

            public double getCarry()
            {
                return carry;
            }

            public void setCarry(double carry)
            {
                this.carry = carry;
            }

            public double getId()
            {
                return id;
            }

            public void setId(double id)
            {
                this.id = id;
            }

            public double getT()
            {
                return t;
            }

            public void setT(double t)
            {
                this.t = t;
            }

            public static class ChampionBeanX
            {
                /**
                 * display_name : 皮城女警
                 * name : Caitlyn
                 * title : 凯特琳
                 * id : 51
                 */

                private String display_name;
                private String name;
                private String title;
                private int id;

                public String getDisplay_name()
                {
                    return display_name;
                }

                public void setDisplay_name(String display_name)
                {
                    this.display_name = display_name;
                }

                public String getName()
                {
                    return name;
                }

                public void setName(String name)
                {
                    this.name = name;
                }

                public String getTitle()
                {
                    return title;
                }

                public void setTitle(String title)
                {
                    this.title = title;
                }

                public int getId()
                {
                    return id;
                }

                public void setId(int id)
                {
                    this.id = id;
                }
            }
        }
    }
}
