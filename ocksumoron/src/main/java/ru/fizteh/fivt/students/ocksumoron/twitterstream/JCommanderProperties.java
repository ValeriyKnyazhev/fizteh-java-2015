package ru.fizteh.fivt.students.ocksumoron.twitterstream;

import com.beust.jcommander.*;

/**
 * Created by ocksumoron on 24.09.15.
 */
public class JCommanderProperties {

    private static final int DEFAULT_LIMIT = 100;

    @Parameter(names = {"-q", "--query"}, description = "Query type")
    private String query = "";

    @Parameter(names = {"-p", "--place"}, description = "Place type")
    private String place = "nearby";

    @Parameter(names = {"-s", "--stream"}, description = "Stream mode")
    private boolean isStream = false;

    @Parameter(names = {"--hideRetweets"}, description = "Hide retweets")
    private boolean hideRetweets = false;

    @Parameter(names = {"-l", "--limit"}, description = "Tweets limit")
    private Integer limitNumber = DEFAULT_LIMIT;

    @Parameter(names = {"-h", "--help"}, description = "Print help")
    private boolean printHelp = false;

    public boolean isPrintHelp() {
        return printHelp;
    }

    public Integer getLimitNumber() {
        return limitNumber;
    }

    public boolean isHideRetweets() {
        return hideRetweets;
    }

    public boolean isStream() {
        return isStream;
    }

    public String getPlace() {
        return place;
    }

    public String getQuery() {
        return query;
    }
}
