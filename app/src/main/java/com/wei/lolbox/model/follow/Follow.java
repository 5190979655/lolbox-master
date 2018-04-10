package com.wei.lolbox.model.follow;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者：赵若位
 * 时间：2017/12/6
 * 邮箱：1070138445@qq.com
 * 功能：
 */

//Todo 这个model可以优化一下
public class Follow
{

    /**
     * code : 0
     * data : {"categories":[{"cid":2,"mediaAccounts":[{"id":638,"img":"http://s1.dwstatic.com/vhuya/avatar/50/07/200_200/2a1c68f6caa9088a88fccd3a8df35469.jpg?t=1437745951","name":"多玩LOL","uid":50075229},{"id":4745,"img":"http://s1.dwstatic.com/vhuya/avatar/16/10/200_200/0f1dbf4abbef2d6d4d1b77d17c00adc5.jpg?t=1472614230","name":"聚印象视频","uid":1610372258},{"id":4607,"img":"http://s1.dwstatic.com/vhuya/avatar/15/51/200_200/59cb8eaf35cb7c7fde694b2b447090da.jpg?t=1465798698","name":"西发林","uid":1551046280},{"id":13,"img":"http://image.yy.com/ojiasnsimage/cd5628451b207ac4becfafec4c04a90c_len41605.jpg","name":"每日撸报","uid":2168000137},{"id":2273,"img":"http://s1.dwstatic.com/vhuya/0D/1D/0d1dd59f221d43ff2d7d4fae5b53490e5787.jpg","name":"质量王者局","uid":503703117},{"id":90429,"img":"http://screenshot.dwstatic.com/ojiasnsimage/d3bf830b266fd5de22de6b9e2682959c_len3780.jpg?imageview/0/w/150/h/150/format/jpg","name":"还有这种操作","uid":2169374545},{"id":7,"img":"http://image.yy.com/ojiasnsimage/8dbff54e02eeca658273965c04b3cb71_len12489.jpg","name":"抗韩中年人","uid":2168000131},{"id":965,"img":"http://s1.dwstatic.com/vhuya/avatar/79/46/200_200/8352b1996ed27e33cebf9c6e25357b56.jpg?t=1495448494","name":"起小点是大腿","uid":79464989},{"id":4,"img":"http://image.yy.com/ojiasnsimage/a25f34dd4e57f8b16d57292aa9f0c801_len9004.jpg","name":"LOL皮肤视频","uid":2168000128},{"id":5481,"img":"http://screenshot.dwstatic.com/ojiasnsimage/7504042a7883d3939571318bd8606639_len9841.jpg?imageview/0/w/150/h/150/format/jpg","name":"版本抢鲜看","uid":2169013127},{"id":5410,"img":"http://screenshot.dwstatic.com/ojiasnsimage/7dd43c5d4af8de322496deba43bd19e3_len11037.jpg?imageview/0/w/150/h/150/format/jpg","name":"龙猫映画","uid":516112976},{"id":5459,"img":"http://screenshot.dwstatic.com/ojiasnsimage/adc9e80030edcef0b7c6d9d545b0ddc6_len16872.jpg?imageview/0/w/150/h/150/format/jpg","name":"天下英雄","uid":2168966290},{"id":4823,"img":"http://s1.dwstatic.com/vhuya/avatar/16/37/200_200/1e83628a6b8e18df56d280c7168c51bb.jpg?t=1477182360","name":"魔力瞎令营","uid":1637967103},{"id":5451,"img":"http://screenshot.dwstatic.com/ojiasnsimage/b0e1619c12af46638262e078ec3614a5_len33096.jpg?imageview/0/w/150/h/150/format/jpg","name":"赛事解析","uid":2168957137},{"id":4065,"img":"http://s1.dwstatic.com/duowanvideo/avatar/14/25/200_200/1b0f8acc160c5c39f3e3cc8db2e6b893.jpg?t=1511245878","name":"撸啊撸小牙","uid":1425664948},{"id":6080,"img":"http://s1.dwstatic.com/duowanvideo/avatar/11/27/200_200/699855c684b69c8691aada8a996332a0.jpg?t=1490096691","name":"撸撸学院(超神小二","uid":1127263746},{"id":92536,"img":"http://screenshot.dwstatic.com/ojiasnsimage/aee49371579830cda6eade94c120dee9_len4597.jpg?imageview/0/w/150/h/150/format/jpg","name":"四级考试","uid":2169621103},{"id":95052,"img":"http://screenshot.dwstatic.com/ojiasnsimage/c0c65dcc578728d8855dcbe61f0e17b5_len15268.jpg?imageview/0/w/150/h/150/format/jpg","name":"到此议游","uid":2169878339},{"id":9482,"img":"http://screenshot.dwstatic.com/ojiasnsimage/28c2756f8a2178b0e48e58d4225ee7c8_len3759.jpg?imageview/0/w/150/h/150/format/jpg","name":"德玛西亚杯","uid":2169358542},{"id":6911,"img":"http://screenshot.dwstatic.com/ojiasnsimage/aca7b4e5c37edc0edd66c50776e7a65a_len4829.png?imageview/0/w/150/h/150/format/jpg","name":"最强亡者","uid":2169159213},{"id":2800,"img":"http://s1.dwstatic.com/vhuya/1F/BC/1fbc07b4a59113f858077e1aefff72753662.jpg","name":"九毛出品","uid":918397202},{"id":4340,"img":"http://screenshot.dwstatic.com/ojiasnsimage/1d3ec056a2b8214fa328089b39fae10c_len8660.jpg?imageview/0/w/150/h/150/format/jpg","name":"搜罗联盟","uid":1486645287},{"id":23,"img":"http://image.yy.com/ojiasnsimage/bc800dafd7b759799b615a18b7a2b6ed_len32383.jpg","name":"FA主播粗事了","uid":2168000147},{"id":4733,"img":"http://s1.dwstatic.com/vhuya/avatar/16/05/200_200/e0e69e5397df16528788ce54137027d0.jpg?t=1472007902","name":"长歌是大腿","uid":1605639526},{"id":4091,"img":"http://s1.dwstatic.com/vhuya/avatar/14/34/200_200/98f2e3983b05fc3d9a9d12ecedb71634.jpg?t=1473668471","name":"飞熊TV","uid":1434083354},{"id":1184,"img":"http://s1.dwstatic.com/vhuya/avatar/11/00/200_200/0299866fe22542fffd64c138d0a4b07f.jpg?t=1450775296","name":"闪电喵TOP10","uid":110007424},{"id":1445,"img":"http://s1.dwstatic.com/vhuya/avatar/15/81/200_200/5b09b09b10797461a19296a8e79311f6.jpg?t=1456134336","name":"主播真扯蛋","uid":158132822},{"id":5263,"img":"http://screenshot.dwstatic.com/ojiasnsimage/5aca7d88b2a82843c9d9149f24d0ceb4_len14681.jpg?imageview/0/w/150/h/150/format/jpg","name":"主播碉堡了","uid":2168539082},{"id":4413,"img":"http://s1.dwstatic.com/duowanvideo/avatar/14/96/200_200/fcc5fb9c387da9f92301df132370212e.jpg?t=1496282019","name":"豚鼠视频","uid":1496093001},{"id":3268,"img":"http://s1.dwstatic.com/vhuya/CF/E6/cfe6e8f2746b46865ca86d289119bf822660.jpg","name":"小数点大爆炸","uid":1107213348},{"id":2808,"img":"http://s1.dwstatic.com/vhuya/avatar/92/28/200_200/a8097e42750244e0a8be9b7be2c52a26.jpg?t=1455440991","name":"最强操作","uid":922847213},{"id":5137,"img":"http://s1.dwstatic.com/vhuya/avatar/17/03/200_200/d937ef26bacb0c7a9fe1abb3639e428e.jpg?t=1494661445","name":"周周五杀榜","uid":1703832705},{"id":304,"img":"http://s1.dwstatic.com/vhuya/avatar/96/87/200_200/31de3b203c80056146707533b753b415.jpg?t=1483760539","name":"暴走五杀系列","uid":9687807},{"id":5440,"img":"http://screenshot.dwstatic.com/ojiasnsimage/67b289358686030ddad4333593e0e86b_len10174.jpg?imageview/0/w/150/h/150/format/jpg","name":"电竞有个圈","uid":2168883085},{"id":2876,"img":"http://s1.dwstatic.com/vhuya/B9/4C/b94c316cb85feb54cfb84d09887674ee7103.jpg","name":"无名","uid":958244431},{"id":3351,"img":"http://s1.dwstatic.com/vhuya/avatar/11/34/200_200/91c2a6db0a98aedbd3eee21ed672f40f.jpg?t=1471950981","name":"电竞交际花","uid":1134973694},{"id":5412,"img":"http://screenshot.dwstatic.com/ojiasnsimage/5f5f61099c899b77985f60fcaaa928a9_len17752.jpg?imageview/0/w/150/h/150/format/jpg","name":"主播你别皮","uid":2168826708}],"name":"热门栏目"},{"cid":3,"mediaAccounts":[{"id":706,"img":"http://s1.dwstatic.com/vhuya/avatar/61/40/200_200/fdadda599ebfa17062c8f7269b5e308d.jpg?t=1427942439","name":"徐老师","uid":61404641},{"id":1180,"img":"http://s1.dwstatic.com/vhuya/avatar/10/99/200_200/ba679140a4377980088732233fef2420.jpg?t=1448710809","name":"峰峰侠","uid":109953212},{"id":1445,"img":"http://s1.dwstatic.com/vhuya/avatar/15/81/200_200/5b09b09b10797461a19296a8e79311f6.jpg?t=1456134336","name":"主播真扯蛋","uid":158132822},{"id":91711,"img":"http://s1.dwstatic.com/duowanvideo/avatar/17/91/200_200/ea185b5e917c3c5615e9a81d473cc47e.jpg?t=1497989933","name":"电竞哲学君","uid":1791501519},{"id":31,"img":"http://image.yy.com/ojiasnsimage/a9496f3709851524d6160655cd72674f_len2780.jpg","name":"TOP锦集","uid":2168000155},{"id":2629,"img":"http://s1.dwstatic.com/vhuya/avatar/80/35/200_200/caca8b842222ab5aa446613cb053026f.jpg?t=1480663433","name":"Numen","uid":803575426},{"id":6910,"img":"http://screenshot.dwstatic.com/ojiasnsimage/f8f5268e03a4635df4c810a1e167be31_len14149.png?imageview/0/w/150/h/150/format/jpg","name":"游戏大联盟","uid":2169159184},{"id":27,"img":"http://image.yy.com/ojiasnsimage/664ab9e84578f621adf65d079861dda5_len18252.png","name":"LOL精彩时刻","uid":2168000151},{"id":15,"img":"http://image.yy.com/ojiasnsimage/00d31e68282fe6768324bcebd95b2fd3_len28413.jpg","name":"主播哈哈哈","uid":2168000139},{"id":92536,"img":"http://screenshot.dwstatic.com/ojiasnsimage/aee49371579830cda6eade94c120dee9_len4597.jpg?imageview/0/w/150/h/150/format/jpg","name":"四级考试","uid":2169621103},{"id":94029,"img":"http://screenshot.dwstatic.com/ojiastoreimage/31afe495d6eedf6d36963fe23d2c44c0.png","name":"BESTHERO","uid":1817173555},{"id":92473,"img":"http://screenshot.dwstatic.com/ojiasnsimage/f4baf76428de67daec77d5ef8c73044d_len2717.jpg?imageview/0/w/150/h/150/format/jpg","name":"招牌英雄","uid":2169615377},{"id":5775,"img":"http://s1.dwstatic.com/vhuya/avatar/14/03/200_200/63f889338bb95118c833ccf56e93a4bc.jpg?t=1489653125","name":"旧梦视频团队","uid":140359298},{"id":3172,"img":"http://s1.dwstatic.com/duowanvideo/avatar/10/62/200_200/38e55a17eaecb18e63d46ac21a1abec9.jpg?t=1504215146","name":"暴走大神","uid":1062484609},{"id":16,"img":"http://image.yy.com/ojiasnsimage/5ff6503743fbbb4cc8f0d0e9f38de940_len14563.jpg","name":"布姆学院","uid":2168000140},{"id":4599,"img":"http://s1.dwstatic.com/vhuya/avatar/15/48/200_200/280e1cab7316d273aca998ff79b2d43e.jpg?t=1465399791","name":"热狗字幕组","uid":1548412287},{"id":4160,"img":"http://s1.dwstatic.com/vhuya/avatar/14/47/200_200/32326416a6275f37f92c0e599c256ca1.jpg?t=1450333703","name":"全球电竞网","uid":1447728195},{"id":28,"img":"http://image.yy.com/ojiasnsimage/ad6c4606de45074f24d2f2e649c5d5f0_len2118.jpg","name":"搞笑动画","uid":2168000152}],"name":"热门订阅号"},{"cid":4,"mediaAccounts":[{"id":5413,"img":"http://m1.dwstatic.com/huodong/shouji3/201412/939/03/120_120_xc897661c75039e5f582ca36f392a50a2.jpg","name":"Miss七芯海棠","uid":2293903},{"id":2514,"img":"http://s1.dwstatic.com/vhuya/6F/18/6f1873173f5fe6993722815f06638a8e4529.jpg","name":"大司马","uid":681724990},{"id":32,"img":"http://image.yy.com/ojiasnsimage/77c6dc272d4295f9b0ae6b1a4d08cebb_len14079.jpg","name":"JY解说","uid":2168000156},{"id":1804,"img":"http://screenshot.dwstatic.com/ojiastoreimage/0a3a283767f0d0be080724715af475fc.jpg","name":"小漠解说","uid":298555366},{"id":2794,"img":"http://screenshot.dwstatic.com/ojiastoreimage/e531ef3bf96785b085ee0f010b82ef95.jpg","name":"若风","uid":915435961},{"id":36,"img":"http://image.yy.com/ojiasnsimage/6fff5cd72473b95d284526347dfb5102_len6856.jpg","name":"小苍解说","uid":2168000160},{"id":37,"img":"http://image.yy.com/ojiasnsimage/81496e88a9a02d768107214612fd5cb7_len8322.jpg","name":"超神解说","uid":2168000161},{"id":820,"img":"http://s1.dwstatic.com/boke_avatar/81/E9/81e92ce3f092c0c61834d6682b3070801867.jpg","name":"伊芙蕾雅","uid":68514239},{"id":824,"img":"http://s1.dwstatic.com/vhuya/98/AF/98af9686fb2eb6dc54c94c1f274018303666.png","name":"老斯讲堂","uid":68900721},{"id":7949,"img":"http://s1.dwstatic.com/duowanvideo/avatar/17/18/200_200/6b2d725d5f5024ec9cfc62739b7f9948.jpg?t=1495701537","name":"小心解说","uid":1718278522},{"id":873,"img":"http://s1.dwstatic.com/vhuya/7F/75/7f759afce4c2541b0c9757ca3f257b4b669.jpg","name":"吹雪解说","uid":72409307},{"id":3511,"img":"http://s1.dwstatic.com/vhuya/avatar/12/24/200_200/8bac9276e77a6d1a609b6b1fa4ff2742.jpg?t=1436984382","name":"信一解说","uid":1224238474},{"id":824,"img":"http://s1.dwstatic.com/vhuya/98/AF/98af9686fb2eb6dc54c94c1f274018303666.png","name":"老斯讲堂","uid":68900721},{"id":343,"img":"http://s1.dwstatic.com/duowanvideo/avatar/12/11/200_200/7973fdcfb1f7bb61cd6eaae569365954.jpg?t=14852","name":"随风解说","uid":12112267},{"id":43,"img":"http://image.yy.com/ojiasnsimage/6a2bf8e6747544c4876bde0e450aa6e6_len7386.jpg","name":"诅咒解说","uid":2168000167},{"id":41,"img":"http://image.yy.com/ojiasnsimage/43989c63c73e6b4902672557fdebdece_len8248.jpg","name":"原凉解说","uid":2168000165},{"id":40,"img":"http://image.yy.com/ojiasnsimage/1e35cedded234020b44dbdb67865c6ee_len5990.jpg","name":"枪炮解说","uid":2168000164},{"id":38,"img":"http://image.yy.com/ojiasnsimage/11ef73a310b24305b3aa67dea7638811_len5465.jpg","name":"安静苦笑","uid":2168000162},{"id":33,"img":"http://image.yy.com/ojiasnsimage/c86d215d7df1888324f4f141ae58ac25_len7572.jpg","name":"小智解说","uid":2168000158},{"id":1217,"img":"http://s1.dwstatic.com/vhuya/avatar/11/65/200_200/2c2187023eaf45a50e06ab0d87ee93b7.jpg?t=1478336914","name":"阿信解说","uid":116544021},{"id":315,"img":"http://s1.dwstatic.com/vhuya/avatar/10/38/200_200/462620d078393f77732b673967a60a00.jpg?t=1451103424","name":"EMP解说","uid":10380392},{"id":3985,"img":"http://s1.dwstatic.com/vhuya/avatar/13/57/200_200/e3e84e555d56e05a2bde5b8497b5a796.jpg?t=1441982362","name":"灰太狼解说","uid":1357782190},{"id":3412,"img":"http://s1.dwstatic.com/vhuya/avatar/11/67/200_200/7822349d6bd13866e87d6648c0e51f22.jpg?t=1456210458","name":"番茄导师","uid":1167394753}],"name":"LOL解说"},{"cid":6,"mediaAccounts":[{"id":96254,"img":"http://screenshot.dwstatic.com/ojiasnsimage/b28000c11e1db7f8a76e379d657105f2_len35707.jpg?imageview/0/w/150/h/150/format/jpg","name":"2017世界总决赛","uid":2169986304},{"id":25,"img":"http://image.yy.com/ojiasnsimage/4d583f8eb2f4206e97286122a19542ab_len9515.png","name":"2017LPL","uid":2168000149},{"id":5467,"img":"http://screenshot.dwstatic.com/ojiasnsimage/d367abd054a74e296162d0bed4497c29_len8602.jpg?imageview/0/w/150/h/150/format/jpg","name":"抽风的飞机","uid":2169004688},{"id":5451,"img":"http://screenshot.dwstatic.com/ojiasnsimage/b0e1619c12af46638262e078ec3614a5_len33096.jpg?imageview/0/w/150/h/150/format/jpg","name":"赛事解析","uid":2168957137},{"id":7276,"img":"http://screenshot.dwstatic.com/ojiasnsimage/fb7ddc3b1059cf69c160e31af8e8b052_len10814.jpg?imageview/0/w/150/h/150/format/jpg","name":"2017MSI季中赛","uid":2169218355},{"id":92464,"img":"http://screenshot.dwstatic.com/ojiasnsimage/72a71b742c2490e4c1b215e4f80d088b_len5296.jpg?imageview/0/w/150/h/150/format/jpg","name":"2017洲际赛","uid":2169614497},{"id":90939,"img":"http://screenshot.dwstatic.com/ojiasnsimage/ff3ebf9ad60fe3230be107846d69923c_len3398.jpg?imageview/0/w/150/h/150/format/jpg","name":"不正经介绍","uid":2169453590},{"id":96515,"img":"http://screenshot.dwstatic.com/ojiasnsimage/069fc90b9231b8b96952b2304feeb24a_len25543.jpg?imageview/0/w/150/h/150/format/jpg","name":"NEST赛事","uid":2169993334},{"id":9482,"img":"http://screenshot.dwstatic.com/ojiasnsimage/28c2756f8a2178b0e48e58d4225ee7c8_len3759.jpg?imageview/0/w/150/h/150/format/jpg","name":"德玛西亚杯","uid":2169358542},{"id":5257,"img":"http://image.yy.com/ojiasnsimage/98515b35a27fb571ff7b54e1f947295a_len12200.png?imageview/0/w/150/h/150/format/jpg","name":"两分钟赛事回顾","uid":2168392137},{"id":26,"img":"http://image.yy.com/ojiasnsimage/3458b85f9575881278d0f9d9dcccafe3_len18189.jpg","name":"2017LCK","uid":2168000150}],"name":"LOL比赛"},{"cid":5,"mediaAccounts":[{"id":3,"img":"http://image.yy.com/ojiasnsimage/5f4b57aaf0549a29890afa4f95a448c8_len18046.jpg","name":"Faker","uid":2168000126},{"id":4495,"img":"http://s1.dwstatic.com/vhuya/avatar/15/18/200_200/d062b3d4230a7a9a8abfd7eed5963c47.jpg?t=1461743178","name":"DOPA","uid":1518434786},{"id":5050,"img":"http://image.yy.com/ojiasnsimage/03591708cf4cd70ebf35a2c6bf71b391_len13394.jpg","name":"Uzi","uid":1691592144}],"name":"LOL高手视频"},{"cid":7,"mediaAccounts":[{"id":5457,"img":"http://screenshot.dwstatic.com/ojiasnsimage/112d6e3abd16e31b0dcb2fe852e4ead7_len7504.jpg?imageview/0/w/150/h/150/format/jpg","name":"RNG官方","uid":2168965958},{"id":5458,"img":"http://screenshot.dwstatic.com/ojiasnsimage/3d3c71c651ccb116d3ed11fdf4734c5c_len6955.jpg?imageview/0/w/150/h/150/format/jpg","name":"VG官方","uid":2168965964},{"id":5456,"img":"http://screenshot.dwstatic.com/ojiasnsimage/d2a20bbea33f7420c79d27a012be32ec_len9301.jpg?imageview/0/w/150/h/150/format/jpg","name":"EDG官方","uid":2168965950},{"id":5461,"img":"http://screenshot.dwstatic.com/ojiasnsimage/9091ee7b84c85ab96201cbdb92dd17b3_len14767.jpg?imageview/0/w/150/h/150/format/jpg","name":"SKT官方","uid":2168974114}],"name":"战队官方"}]}
     * result : 1
     */

    private int code;
    @SerializedName("data")
    private DataBean data;
    private int result;

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public DataBean getData()
    {
        return data;
    }

    public void setData(DataBean data)
    {
        this.data = data;
    }

    public int getResult()
    {
        return result;
    }

    public void setResult(int result)
    {
        this.result = result;
    }

    public static class DataBean
    {


        @SerializedName("categories")
        private List<CategoriesBean> categories;

        public List<CategoriesBean> getCategories()
        {
            return categories;
        }

        public void setCategories(List<CategoriesBean> categories)
        {
            this.categories = categories;
        }

        public static class CategoriesBean
        {
            private int cid = 1;
            private String name;
            @SerializedName("mediaAccounts")
            private List<MediaAccountsBean> mediaAccounts;

            public int getCid()
            {
                return cid;
            }

            public void setCid(int cid)
            {
                this.cid = cid;
            }

            public String getName()
            {
                return name;
            }

            public void setName(String name)
            {
                this.name = name;
            }

            public List<MediaAccountsBean> getMediaAccounts()
            {
                return mediaAccounts;
            }

            public void setMediaAccounts(List<MediaAccountsBean> mediaAccounts)
            {
                this.mediaAccounts = mediaAccounts;
            }

            public static class MediaAccountsBean
            {
                /**
                 * id : 638
                 * img : http://s1.dwstatic.com/vhuya/avatar/50/07/200_200/2a1c68f6caa9088a88fccd3a8df35469.jpg?t=1437745951
                 * name : 多玩LOL
                 * uid : 50075229
                 */

                private int id;
                private String img;
                private String name;
                private long uid;

                public int getId()
                {
                    return id;
                }

                public void setId(int id)
                {
                    this.id = id;
                }

                public String getImg()
                {
                    return img;
                }

                public void setImg(String img)
                {
                    this.img = img;
                }

                public String getName()
                {
                    return name;
                }

                public void setName(String name)
                {
                    this.name = name;
                }

                public long getUid()
                {
                    return uid;
                }

                public void setUid(long uid)
                {
                    this.uid = uid;
                }
            }
        }
    }
}
