package com.bbh.common.constant;

/**
 * Created by tancheng on 2015/5/28.
 */
public interface ConstantsConfig {
    String CLASSPATH_PREFIX = "classpath*:";
    String PROJECT_SYSTEM_PROPERTIES_NAME = "projectSystem.properties";
    String PROJECT_SYSTEM_PROPERTIES_LOCATION = "classpath*:projectSystem.properties";
    String PROJECT_CUSTOM_PROPERTIES_LOCATION_RULE = "classpath*:config/*.properties";
    String SYSTEM_LOCALE="system.locale";
    //mybatis
    String PROJECT_MYBATIS_TYPE_ALIASES_PACKAGE = "mybatis.config.typeAliasesPackage";
    String PROJECT_MYBATIS_SQL_TYPE = "mybatis.config.sqlType";
    String PROJECT_MYBATIS_BASE_PACKAGE = "mybatis.config.basePackage";
    //druid
    String PROJECT_DRUID_DATASOURCE_USERNAME = "druid.datasource.username";
    String PROJECT_DRUID_DATASOURCE_URL = "druid.datasource.url";
    String PROJECT_DRUID_DATASOURCE_PASSWORD = "druid.datasource.password";
    String PROJECT_DRUID_DATASOURCE_FILTERS = "druid.datasource.filters";
    String PROJECT_DRUID_DATASOURCE_MAXACTIVE = "druid.datasource.maxActive";
    String PROJECT_DRUID_DATASOURCE_INITIALSIZE = "druid.datasource.initialSize";
    String PROJECT_DRUID_DATASOURCE_MAXWAIT = "druid.datasource.maxWait";
    String PROJECT_DRUID_DATASOURCE_MINIDLE = "druid.datasource.minIdle";
    String PROJECT_DRUID_DATASOURCE_TIME_BETWEEN_EVICTION_RUNS_MILLIS = "druid.datasource.timeBetweenEvictionRunsMillis";
    String PROJECT_DRUID_DATASOURCE_MIN_EVICTABLE_IDLE_TIME_MILLIS = "druid.datasource.minEvictableIdleTimeMillis";
    String PROJECT_DRUID_DATASOURCE_VALIDATION_QUERY = "druid.datasource.validationQuery";
    String PROJECT_DRUID_DATASOURCE_TEST_WHILE_IDLE = "druid.datasource.testWhileIdle";
    String PROJECT_DRUID_DATASOURCE_TEST_ON_BORROW = "druid.datasource.testOnBorrow";
    String PROJECT_DRUID_DATASOURCE_TEST_ON_RETURN = "druid.datasource.testOnReturn";
    String PROJECT_DRUID_DATASOURCE_POOL_PREPARED_STATEMENTS = "druid.datasource.poolPreparedStatements";
    String PROJECT_DRUID_DATASOURCE_MAX_OPEN_PREPARED_STATEMENTS = "druid.datasource.maxOpenPreparedStatements";
    String PROJECT_DRUID_DATASOURCE_SLOW_SQL_MILLIS = "druid.datasource.slowSqlMillis";
    String PROJECT_DRUID_DATASOURCE_IS_LOG_SLOW_SQL = "druid.datasource.isLogSlowSql";

    //http
    String HTTP_CLIENT_SOCKET_TIME_OUT = "http.client.socketTimeout";
    String HTTP_CLIENT_CONNECTION_REQUEST_TIME_OUT = "http.client.connectionRequestTimeout";
    String HTTP_CLIENT_CONNECTION_TIME_OUT = "http.client.connectionTimeout";
    String HTTP_CLIENT_CLOSE_IDLE_CONNECTIONS = "http.client.closeIdleConnections";
    String EHCACHE_FILE = "ehcache.file";
    //mvc
    String    MVC_MESSAGE_CACHE_SECONDS="cacheSeconds";
    String    MVC_MESSAGE_PATH="path";
    String    MVC_VIEW_ERROR="error";
    String    MVC_VIEW_PREFIX="prefix";
    String    MVC_VIEW_SUFFIX="suffix";
}

