package test;



import org.hibernate.Session;

import model.User;
import model.Students;
import session.HibernateSessionFactory;

public class Test {

	public static void main(String[] args) {
		User user = new User();
		user.setUsername("z");
		user.setPassword("");
		
		int  N=8;
		Students []stu=new Students[N];
		
		for(int i=0;i<N;i++){
			stu[i]=new Students();	
			stu[i].setXuehao("313060205"+i);
			stu[i].setTel("1575100532"+i);
		}
		int j=0;
		stu[j].setBanji("CS1302");
		stu[j].setName("Jing Tianming");
		stu[j].setSex("boy");
		stu[j].setAge(17);
		stu[j].setPicpath("/students/images/tian1.jpg");
		stu[j].setJianjie("Jing Tianming, China's first 3D martial arts animation \"Qin Shiming month,\" the first actor, the prototype of the original novel for Wen Shiren \"Qin Shiming month\" series actor Jing Tianming. My father is a very excellent swordsman Jingke, his mother is Empress Dowager Li Ji. But some people do not know how high, but very heavy loyalty. His blurred life experience affects the whole piece of the earth changes, but he did not know. [1] Due to life experience was Qin Shihuang kill, on the streets. After the \"Juggernaut\" cover Nie found, very respected on the cover Nie, gradually the feelings of his father and son, to follow the cover Nie learning fencing. In the process of escape, the dawn gradually met a number of rivers and lakes of the Supreme, and have been similar to the age of Xiang Shaoyu, Gao Yue, Shilan become friends, but also witnessed the last piece of the world land of the ruins of Mohist institutions. By chance he became the Mohist giant. Tempered in the dawn gradually grow, distress moments, he even come forward, with their weak shoulders to protect the lives of friends. However, behind all this event seems to have an invisible hand in control, the presence of the mysterious power of the lakes and yin yang home gradually surfaced. In the heart of the dawn of the conspiracy, which layers of stripping his life experience and behind all the shaking secret of the conspiracy.");;
		j=1;
		stu[j].setBanji("CS1301");
		stu[j].setName("Naruto");
		stu[j].setSex("boy");
		stu[j].setAge(21);
		stu[j].setPicpath("/students/images/min1.jpg");
		stu[j].setJianjie("Japanese anime \"Naruto\" hero. The country of fire Leaves of the village of Ninja, four generations of Huo Ying Huo wave water door and the second generation of nine people column force whirlpool Jiu Xinnai son, six fairy second son Asura reincarnation. Newborn parents to protect the village and sacrifice, and a powerful tail beast - nine seals in the Ming people. Naruto became orphan grew up in the cold and lonely, but in the only recognition of his teacher Ikuru Ibaruka and three generations of head Huoying encouraged, Naruto determined to become Naruto, so that everyone agrees with his presence. Officially became ninja, with the flag wood Kakashi, Uchiha Sasuke and spring wild cherry seventh class, together embarked on the road of practice. For the guardian and the fetters between partners, Naruto constantly diligent practice refining, become Kiba \"three forbearance\" one of the unsolicited close disciples, learned his father's Ninjutsu spiral pill. And later trained Xiu Shu and defeated the attack on the leaves of the \"dawn\" leader Payne became everyone praised Kiba heroes. After Naruto successfully control the body of the nine chakras, and in the fourth world war with the Sasuke help hand in hand, become a hero to save the world. Finally, Naruto finally realize his dream, became a Naruto, and the day to the young child has a son and a daughter.");;
		j=2;
		stu[j].setBanji("CS1301");
		stu[j].setName("Conan");
		stu[j].setSex("boy");
		stu[j].setAge(19);
		stu[j].setPicpath("/students/images/ke1.jpg");
		stu[j].setJianjie("Japanese anime \"Detective Conan\" the hero and \"magic fast bucket\" in the guest role. True identity for the high school student Detective Kudo new one, known as the \"Heisei Holmes\", \"the Japanese police savior.\" He tried to follow members of the black group was attacked, and was dug under the code-named \"APTX4869\" poison, although spared to death, but the body is reduced to first grade students look like. After seeking the help of Dr. A Li, was childhood sweetheart's girlfriend Mao Lilan asked his name, the name of Edogawa Conan. At the suggestion of Dr. Kariya, she resides in the home of Maori Kogoro, the father of Xiaolan, not only to solve various cases, but also to secretly investigate black organizations.");;
		j=3;
		stu[j].setBanji("CS1302");
		stu[j].setName("Sun Wukong");
		stu[j].setSex("boy");
		stu[j].setAge(3000);
		stu[j].setPicpath("/students/images/kong1.jpg");
		stu[j].setJianjie("Sun Wukong is one of the famous mythical characters in China. It comes from the Four Famous Journey to the West. The ancestral home of East China, by the epoch-making since the immortal stone birth, due to lead the group of monkeys into Shuidian Dong and become the monkey king, respect for the Monkey King. \"After Qianshan Wanshui Baifu Bodhi teacher as a teacher , The name Sun Wukong, learn to evil changes seventy-two, somersault cloud, immortal and other superb spells. Mitac first into the Monkey King made the first wishful Jinji Bang, and to the government hook to life and death book, , Known as the Bima Wen. That low-ranking post angry back to Huaguo Shan, and defeated Tota King and Us three prince of crusade, forcing the Jade Emperor to seal the monastery, and in the sky to build monasteries Because of drunken chaos the Queen Mother of the peach event, steal the Laojun gold lord, made of King Kong is not bad footer, between the Shanglaojun Laojun alchemy furnace And later on in the fight with the Tathagatari in the defeat, the pressure in the Tathagata rounding of a hand-in-the-house, the Tien-hsiang, the four heavenly kings, After the Guanyin Bodhisattva, was rescued by the monk, law Walker, to protect the monk to learn from the West, all the way down demon slayer, defying hardships. Sun Wukong is intelligent, lively, loyal, jealous of evil, as in the Chinese folk culture has become the embodiment of wit and bravery, the Chinese people will be hard to overcome the difficulties of the Chinese people, He was a god.");;
		j=4;
		stu[j].setBanji("CS1302");
		stu[j].setName("Chloe Zhao");
		stu[j].setSex("girl");
		stu[j].setAge(25);
		stu[j].setPicpath("/students/images/zyh1.jpg");
		stu[j].setJianjie("Chloe Zhao (Chloe Zhao), was born in Jilin Province, Jilin Province, mainland China actress. Beijing Tian Hao Spirit Culture Communication Co., Ltd. signed artists. 2011 starring in the film \"adolescence\", starred in November, \"Youth Paradise Lost.\" In June 2012 appeared in \"adolescence 3\", and won the \"56 premiere micro film\" best actress award. In 2013 January starred in the \"host\". In December 16 appeared in the fashion director inspirational stewardess theme comedy \"back-up stewardess\"; in December, director of the movie \"love love embarrassing things\"; in October, Chen Zhengdao director of the love fashion funny drama \" . In 2014, participating in the Suo Mo screenwriter drama \"Bao laugh hall\" and \"adolescence 4\"");;
		j=5;
		stu[j].setBanji("CS1301");
		stu[j].setName("Yang Ying");
		stu[j].setSex("girl");
		stu[j].setAge(27);
		stu[j].setPicpath("/students/images/yh1.jpg");
		stu[j].setJianjie("Angelababy, Chinese name Yang Ying, February 28, 1989 Born in Shanghai, Mainland China film and television actress, model. In 2003 to model identity debut. 2007 will be the focus of acting career to the big screen. In 2009 starring love movie \"love the city.\" 2011 in the love movie \"summer music\" for the first time as the heroine. In 2012 with the love film \"first\" won the thirteenth Chinese Film Media Award \"most attention actress award\". January 2013, \"Southern Entertainment Week\" held in Cenozoic four small Huadan selection activities, Angelababy to 70 points overall score was elected as the new \"four small Huadan\" one");;
		
		j=6;
		stu[j].setBanji("CS1302");
		stu[j].setName("Hinata");
		stu[j].setSex("girl");
		stu[j].setAge(16);
		stu[j].setPicpath("/students/images/ct1.jpg");
		stu[j].setJianjie("Japanese anime \"Naruto\" in the figure. The country of fire Leaves of the village Ninja, Kiba door door to a family of the entropy of eldest daughter, one of the descendants of large wooden plume village, with high purity of the supercilious, was Scheeren and large barrel of the souls of the dead are called \" Of the princess \".Like the hero from an early age whirlpool Naruto. Originally a weak character of the girl, but under the influence of Naruto gradually become strong, and gradually grow into a good female ninja. The story finally became Naruto's wife, and has a son and a daughter.");;
		j=7;
		stu[j].setBanji("CS1301");
		stu[j].setName("Bai Suzhen");
		stu[j].setSex("girl");
		stu[j].setAge(1800);
		stu[j].setPicpath("/students/images/bsz1.jpg");
		stu[j].setJianjie("Bai Suzhen, was born in Chengdu, Sichuan Qingchengshan, is a practice of the Millennium Snake cents. [1] Legend for the mother of Li Shan disciples, for the ancient Chinese folk one of the four love legend \"White Snake\" hero. Bai Suzhen in Mount Qingcheng and Mount Emei practice enlightenment, spell power. Her beautiful peerless, bright eyes white teeth, Empress Dowager Celestial, set the world beautiful and elegant in a noble and elegant. Nature good Bodhisattva heart, with Qi Huang medical hanging pot for the benefit of the people, merit. In 1992, played by Bai Yazhi Bai Suzhen, as its standard image. Laid the status of the first beauty of Zhao Yazhi classic [2]. Bai Suzhen to Xu Xian 1700 years ago to save the life of grace, for their body to promise, their love is unswerving. Jinshan Temple Monk Fa Hai confuse Xu Xian, divorce their couples, Xu Xian listen to calumny, abandoned home Jinshan. Bai Suzhen to Jinshan Suofu, and the sea of law fighting resulted in flooding Jinshan. France with a strong force to break them, the pressure on the pagoda in the pagoda. Twenty years after the white snake son Xu Shilin Xiaogan Xiaotian moving days, white snake finally tower, homing immortal class.");;
		
		

		
		Session dbs = HibernateSessionFactory.getSession();
		dbs.beginTransaction();
		dbs.save(user);
		for(int i=0;i<N;i++){
			dbs.save(stu[i]);
		}
		
		dbs.beginTransaction().commit();

	}

}