package Util;

import java.util.List;

import Entities.Article;
import Entities.User;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

public class AppSettings
{
    public static boolean UseServers = true;

    public static String IpAddress = "192.168.178.200";
    public static int AuthenticationPort = 31220;
    public static int ContentManagementPort = 31221;
    public static int SubscriptionPort = 31223;
    public static int UsermanagementPort = 31224;

    public static String Email;
    public static String Password;

    public static List<Article> Articles;
    public static int ArticleArrayPosition;

    public static List<User> Users;
    public static int UserArrayPosition;

    public static int LoggedInUserId;
    public static String SearchQuery;
}
