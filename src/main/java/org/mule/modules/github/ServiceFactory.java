/**
 * Mule GitHub Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.github;

import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.CollaboratorService;
import org.eclipse.egit.github.core.service.CommitService;
import org.eclipse.egit.github.core.service.DeployKeyService;
import org.eclipse.egit.github.core.service.DownloadService;
import org.eclipse.egit.github.core.service.GistService;
import org.eclipse.egit.github.core.service.IssueService;
import org.eclipse.egit.github.core.service.LabelService;
import org.eclipse.egit.github.core.service.MilestoneService;
import org.eclipse.egit.github.core.service.RepositoryService;
import org.eclipse.egit.github.core.service.TeamService;
import org.eclipse.egit.github.core.service.UserService;
import org.eclipse.egit.github.core.service.WatcherService;

public class ServiceFactory {

    private static final String BASE_URL = "api.github.com";
    private static IssueService defaultIssueService;
    private static WatcherService defaultWatcherService;
    private static CollaboratorService defaultCollaboratorService;
    private static CommitService defaultCommitService;
    private static DeployKeyService defaultDeployKeyService;
    private static DownloadService defaultDownloadService;
    private static GistService defaultGistService;
    private static LabelService defaultLabelService;
    private static MilestoneService defaultMilestoneService;
    private static UserService defaultUserService;
    private static TeamService defaultTeamService;
    private static RepositoryService defaultRepositoryService;
    private final String password;
    private final String user;

    public ServiceFactory(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public IssueService getIssueService() {
        if (defaultIssueService != null) {
            return defaultIssueService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new IssueService(client);
    }

    public WatcherService getWatcherService() {
        if (defaultWatcherService != null) {
            return defaultWatcherService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new WatcherService(client);
    }

    public CommitService getCommitService() {
        if (defaultCommitService != null) {
            return defaultCommitService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new CommitService(client);
    }

    public CollaboratorService getCollaboratorService() {
        if (defaultCollaboratorService != null) {
            return defaultCollaboratorService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new CollaboratorService(client);
    }

    public DeployKeyService getDeployKeyService() {
        if (defaultDeployKeyService != null) {
            return defaultDeployKeyService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new DeployKeyService(client);
    }

    public DownloadService getDownloadService() {
        if (defaultDownloadService != null) {
            return defaultDownloadService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new DownloadService(client);
    }

    public GistService getGistService() {
        if (defaultGistService != null) {
            return defaultGistService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new GistService(client);
    }

    public LabelService getLabelService() {
        if (defaultLabelService != null) {
            return defaultLabelService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new LabelService(client);
    }

    public MilestoneService getMilestoneService() {
        if (defaultMilestoneService != null) {
            return defaultMilestoneService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new MilestoneService(client);
    }

    public UserService getUserService() {
        if (defaultUserService != null) {
            return defaultUserService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new UserService(client);
    }

    public TeamService getTeamService() {
        if (defaultTeamService != null) {
            return defaultTeamService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new TeamService(client);
    }

    public RepositoryService getRepositoryService() {
        if (defaultRepositoryService != null) {
            return defaultRepositoryService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new RepositoryService(client);
    }

    public static void setDefaultIssueService(IssueService defaultIssueService) {
        ServiceFactory.defaultIssueService = defaultIssueService;
    }

    public static void setDefaultWatcherService(WatcherService defaultWatcherService) {
        ServiceFactory.defaultWatcherService = defaultWatcherService;
    }

    public static void setDefaultCollaboratorService(CollaboratorService defaultCollaboratorService) {
        ServiceFactory.defaultCollaboratorService = defaultCollaboratorService;
    }

    public static void setDefaultCommitService(CommitService defaultCommitService) {
        ServiceFactory.defaultCommitService = defaultCommitService;
    }

    public static void setDeployKeyService(DeployKeyService defaultDeployKeyService) {
        ServiceFactory.defaultDeployKeyService = defaultDeployKeyService;
    }

    public static void setDownloadService(DownloadService defaultDownloadService) {
        ServiceFactory.defaultDownloadService = defaultDownloadService;
    }

    public static void setGistService(GistService defaultGistService) {
        ServiceFactory.defaultGistService = defaultGistService;
    }

    public static void setLabelService(LabelService defaultLabelService) {
        ServiceFactory.defaultLabelService = defaultLabelService;
    }

    public static void setMilestoneService(MilestoneService defaultMilestoneService) {
        ServiceFactory.defaultMilestoneService = defaultMilestoneService;
    }

    public static void setDefaultUserService(UserService defaultUserService) {
        ServiceFactory.defaultUserService = defaultUserService;
    }

    public static void setDefaultTeamService(TeamService defaultTeamService) {
        ServiceFactory.defaultTeamService = defaultTeamService;
    }

    public static void setDefaultRepositoryService(RepositoryService defaultRepositoryService) {
        ServiceFactory.defaultRepositoryService = defaultRepositoryService;
    }
}