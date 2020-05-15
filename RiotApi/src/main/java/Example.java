import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;

public class Example {

        public static void main(String[] args) throws RiotApiException {

            ApiConfig config = new ApiConfig().setKey("kulcs");

            RiotApi api = new RiotApi(config);

            Summoner summoner = api.getSummonerByName(Platform.EUNE, "felhasználónév");

            System.out.println("Name: " + summoner.getName());
            System.out.println("Summoner ID: " + summoner.getId());
            System.out.println("Account ID: " + summoner.getAccountId());
            System.out.println("PUUID: " + summoner.getPuuid());
            System.out.println("Summoner Level: " + summoner.getSummonerLevel());
            System.out.println("Profile Icon ID: " + summoner.getProfileIconId());

        }
    }
}
