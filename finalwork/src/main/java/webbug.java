import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.ArrayList;

public class webbug {
    public static void main(String[] args) {

        try {
            Document doc = Jsoup.connect("https://tw.op.gg/champion/statistics").get();
            System.out.println(doc.title());
            System.out.println("上路T1角:");

            for (int a = 1; a <= 5; a++) {
                String top = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-TOP > tr:nth-child(" + a + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a > div.champion-index-table__name").text();
                System.out.println("排名" + a + ":" + top);
                Elements choose = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-TOP > tr:nth-child(" + a + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a");
                Element choose2 = choose.get(0);
                Document doc2 = Jsoup.connect(choose2.absUrl("href")).get();
                System.out.println(top+"最常使用的兩套符文:");
                Elements images1 = doc2.select("tbody.tabItem.ChampionKeystoneRune-1 div.perk-page  div.perk-page__item.perk-page__item--active  div.perk-page__image >img");
                for(int i = 0; i <= 11; i++){
                    Element image = images1.get(i);
                    System.out.println(image.attr("alt"));
                    while(i == 5){
                        System.out.println("=========");
                        break;
                    }
                }
                System.out.println("=========");
                System.out.println("克制你的前三名英雄:");
                ArrayList<String> counter = new ArrayList<String>();
                for (int s = 0; s < 3; s++){
                    String name2 = doc2.getElementsByClass("champion-stats-header-matchup__table__champion").get(s).text();//counter
                    System.out.println(name2);
                    counter.add(name2);
                }
                System.out.println("=================");
            }
            System.out.println("打野T1角");
            for (int b = 1; b <= 5; b++) {
                String jg = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-JUNGLE > tr:nth-child(" + b + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a > div.champion-index-table__name").text();
                System.out.println("排名" + b + ":" + jg);
                Elements choose = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-TOP > tr:nth-child(" + b + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a");
                Element choose2 = choose.get(0);
                Document doc2 = Jsoup.connect(choose2.absUrl("href")).get();
                System.out.println(jg+"最常使用的兩套符文:");
                Elements images1 = doc2.select("tbody.tabItem.ChampionKeystoneRune-1 div.perk-page  div.perk-page__item.perk-page__item--active  div.perk-page__image >img");
                for(int i = 0; i <= 11; i++){
                    Element image = images1.get(i);
                    System.out.println(image.attr("alt"));
                    while(i == 5){
                        System.out.println("=========");
                        break;
                    }
                }
                System.out.println("=========");
                System.out.println("克制你的前三名英雄:");
                ArrayList<String> counter = new ArrayList<String>();
                for (int s = 0; s < 3; s++){
                    String name2 = doc2.getElementsByClass("champion-stats-header-matchup__table__champion").get(s).text();//counter
                    System.out.println(name2);
                    counter.add(name2);
                }
                System.out.println("=================");
            }
            System.out.println("中路T1角");
            for (int c = 1; c <= 5; c++) {
                String mid = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-MID > tr:nth-child(" + c + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a > div.champion-index-table__name").text();
                System.out.println("排名 " + c + ":" + mid);
                Elements choose = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-TOP > tr:nth-child(" + c + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a");
                Element choose2 = choose.get(0);
                Document doc2 = Jsoup.connect(choose2.absUrl("href")).get();
                System.out.println(mid+"最常使用的兩套符文:");
                Elements images1 = doc2.select("tbody.tabItem.ChampionKeystoneRune-1 div.perk-page  div.perk-page__item.perk-page__item--active  div.perk-page__image >img");
                for(int i = 0; i <= 11; i++){
                    Element image = images1.get(i);
                    System.out.println(image.attr("alt"));
                    while(i == 5){
                        System.out.println("=========");
                        break;
                    }
                }
                System.out.println("=========");
                System.out.println("克制你的前三名英雄:");
                ArrayList<String> counter = new ArrayList<String>();
                for (int s = 0; s < 3; s++){
                    String name2 = doc2.getElementsByClass("champion-stats-header-matchup__table__champion").get(s).text();//counter
                    System.out.println(name2);
                    counter.add(name2);
                }
                System.out.println("=================");

            }
            System.out.println("下路T1角");
            for (int d = 1; d <= 2; d++) {
                String ad = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-ADC > tr:nth-child(" + d + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a > div.champion-index-table__name").text();
                System.out.println("排名" + d + ":" + ad);
                Elements choose = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-TOP > tr:nth-child(" + d + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a");
                Element choose2 = choose.get(0);
                Document doc2 = Jsoup.connect(choose2.absUrl("href")).get();
                System.out.println(ad+"最常使用的兩套符文:");
                Elements images1 = doc2.select("tbody.tabItem.ChampionKeystoneRune-1 div.perk-page  div.perk-page__item.perk-page__item--active  div.perk-page__image >img");
                for(int i = 0; i <= 11; i++){
                    Element image = images1.get(i);
                    System.out.println(image.attr("alt"));
                    while(i == 5){
                        System.out.println("=========");
                        break;
                    }
                }
                System.out.println("=========");
                System.out.println("克制你的前三名英雄:");
                ArrayList<String> counter = new ArrayList<String>();
                for (int s = 0; s < 3; s++){
                    String name2 = doc2.getElementsByClass("champion-stats-header-matchup__table__champion").get(s).text();//counter
                    System.out.println(name2);
                    counter.add(name2);
                }
                System.out.println("=================");
            }
            System.out.println("輔助T1角");
            for (int e = 1; e <= 4; e++) {
                String sup = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-SUPPORT > tr:nth-child(" + e + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a > div.champion-index-table__name").text();
                System.out.println("排名" + e + ":" + sup);
                Elements choose = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-TOP > tr:nth-child(" + e + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a");
                Element choose2 = choose.get(0);
                Document doc2 = Jsoup.connect(choose2.absUrl("href")).get();
                System.out.println(sup+"最常使用的兩套符文:");
                Elements images1 = doc2.select("tbody.tabItem.ChampionKeystoneRune-1 div.perk-page  div.perk-page__item.perk-page__item--active  div.perk-page__image >img");
                for(int i = 0; i <= 11; i++){
                    Element image = images1.get(i);
                    System.out.println(image.attr("alt"));
                    while(i == 5){
                        System.out.println("=========");
                        break;
                    }
                }
                System.out.println("=========");
                System.out.println("克制你的前三名英雄:");
                ArrayList<String> counter = new ArrayList<String>();
                for (int s = 0; s < 3; s++){
                    String name2 = doc2.getElementsByClass("champion-stats-header-matchup__table__champion").get(s).text();//counter
                    System.out.println(name2);
                    counter.add(name2);
                }
                System.out.println("=================");
            }

        }catch (Exception e) {
            System.out.println(e);
    }
  }
}