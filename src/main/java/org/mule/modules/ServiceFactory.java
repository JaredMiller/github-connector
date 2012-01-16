package org.mule.modules;

import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.IssueService;
import org.eclipse.egit.github.core.service.WatcherService;

public class ServiceFactory {

    private static final String BASE_URL = "api.github.com";
    private static IssueService defaultIssueService;
    private static WatcherService defaultWatcherService;

    public static IssueService getIssueService(String user, String password) {
        if (defaultIssueService != null) {
            return defaultIssueService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new IssueService(client);
    }

    public static WatcherService getWatcherService(String user, String password) {
        if (defaultWatcherService != null) {
            return defaultWatcherService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new WatcherService(client);
    }

    public static void setDefaultIssueService(IssueService defaultIssueService) {
        ServiceFactory.defaultIssueService = defaultIssueService;
    }

    public static void setDefaultWatcherService(WatcherService defaultWatcherService) {
        ServiceFactory.defaultWatcherService = defaultWatcherService;
    }
}