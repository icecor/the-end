import org.jsoup.Jsoup;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class eaw {
    public static void main(String[]Args){
        try{
            Document doc = Jsoup.connect("https://tw.op.gg/champion/statistics").get();
            System.out.println(doc.title());
            int i = 0;
            for(int a = 1; a <= 5; a++) {
                String name = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-TOP > tr:nth-child(" + a + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a > div.champion-index-table__name").text();
                System.out.println("排名: " + a + " " + name);
                Elements choose = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-TOP > tr:nth-child("+ a +") > td.champion-index-table__cell.champion-index-table__cell--champion > a");
                Element choose2 = choose.get(0);
                Document doc2 = Jsoup.connect(choose2.absUrl("href")).get();
                // Elements images = doc2.select("img[src=\"//opgg-static.akamaized.net/images/lol/perk/8437.png?image=q_auto:best&amp;v=1637122822\"]");//抓符文圖片
                Elements td = doc2.select("td.champion-stats-header-matchup__table__champion");
                String text = td.text();
                System.out.println(text);
                /*for (Element image : images) {
                    System.out.println("src : " + image.attr("src"));
                    System.out.println("height : " + image.attr("height"));
                    System.out.println("width : " + image.attr("width"));
                    System.out.println("alt : " + image.attr("alt"));
                }*/
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}