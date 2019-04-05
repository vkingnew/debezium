/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */

package io.debezium.connector.postgresql;

import org.postgresql.core.Oid;

/**
 * Extension to the {@link org.postgresql.core.Oid} class which contains Postgres specific datatypes not found currently in the
 * JDBC driver implementation classes.
 *
 * @author Horia Chiorean (hchiorea@redhat.com)
 */
public final class PgOid extends Oid {

    /**
     * Internal PG types as returned by the plugin
     */
    public static final int JSONB_OID = 3802;
    public static final int TSTZRANGE_OID = 3910;
    public static final int INET_OID = 869;
    public static final int INET_ARRAY = 1041;
    public static final int CIDR_OID = 650;
    public static final int CIDR_ARRAY = 651;
    public static final int MACADDR_OID = 829;
    public static final int MACADDR_ARRAY = 1040;
    public static final int MACADDR8_OID = 774;
    public static final int MACADDR8_ARRAY = 775;
}
