/*
 * This file is generated by jOOQ.
 */
package com.codegen.testcontainer.mysql;


import com.codegen.testcontainer.mysql.tables.Bar;
import com.codegen.testcontainer.mysql.tables.Databasechangelog;
import com.codegen.testcontainer.mysql.tables.Databasechangeloglock;
import com.codegen.testcontainer.mysql.tables.Foo;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>bar</code>.
     */
    public final Bar BAR = Bar.BAR;

    /**
     * The table <code>DATABASECHANGELOG</code>.
     */
    public final Databasechangelog DATABASECHANGELOG = Databasechangelog.DATABASECHANGELOG;

    /**
     * The table <code>DATABASECHANGELOGLOCK</code>.
     */
    public final Databasechangeloglock DATABASECHANGELOGLOCK = Databasechangeloglock.DATABASECHANGELOGLOCK;

    /**
     * The table <code>foo</code>.
     */
    public final Foo FOO = Foo.FOO;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Bar.BAR,
            Databasechangelog.DATABASECHANGELOG,
            Databasechangeloglock.DATABASECHANGELOGLOCK,
            Foo.FOO
        );
    }
}
