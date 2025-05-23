/*
 * This file is generated by jOOQ.
 */
package com.codegen.testcontainer.postgres.tables;


import com.codegen.testcontainer.postgres.DefaultSchema;
import com.codegen.testcontainer.postgres.Keys;
import com.codegen.testcontainer.postgres.tables.Bar.BarPath;
import com.codegen.testcontainer.postgres.tables.records.FooRecord;

import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Foo extends TableImpl<FooRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>foo</code>
     */
    public static final Foo FOO = new Foo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FooRecord> getRecordType() {
        return FooRecord.class;
    }

    /**
     * The column <code>foo.id</code>.
     */
    public final TableField<FooRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>foo.name</code>.
     */
    public final TableField<FooRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>foo.foo_test</code>.
     */
    public final TableField<FooRecord, String> FOO_TEST = createField(DSL.name("foo_test"), SQLDataType.VARCHAR(256), this, "");

    private Foo(Name alias, Table<FooRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Foo(Name alias, Table<FooRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>foo</code> table reference
     */
    public Foo(String alias) {
        this(DSL.name(alias), FOO);
    }

    /**
     * Create an aliased <code>foo</code> table reference
     */
    public Foo(Name alias) {
        this(alias, FOO);
    }

    /**
     * Create a <code>foo</code> table reference
     */
    public Foo() {
        this(DSL.name("foo"), null);
    }

    public <O extends Record> Foo(Table<O> path, ForeignKey<O, FooRecord> childPath, InverseForeignKey<O, FooRecord> parentPath) {
        super(path, childPath, parentPath, FOO);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class FooPath extends Foo implements Path<FooRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> FooPath(Table<O> path, ForeignKey<O, FooRecord> childPath, InverseForeignKey<O, FooRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private FooPath(Name alias, Table<FooRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public FooPath as(String alias) {
            return new FooPath(DSL.name(alias), this);
        }

        @Override
        public FooPath as(Name alias) {
            return new FooPath(alias, this);
        }

        @Override
        public FooPath as(Table<?> alias) {
            return new FooPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<FooRecord> getPrimaryKey() {
        return Keys.PK_FOO;
    }

    private transient BarPath _bar;

    /**
     * Get the implicit to-many join path to the <code>public.bar</code> table
     */
    public BarPath bar() {
        if (_bar == null)
            _bar = new BarPath(this, null, Keys.BAR__FK_FOO_BAR.getInverseKey());

        return _bar;
    }

    @Override
    public Foo as(String alias) {
        return new Foo(DSL.name(alias), this);
    }

    @Override
    public Foo as(Name alias) {
        return new Foo(alias, this);
    }

    @Override
    public Foo as(Table<?> alias) {
        return new Foo(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Foo rename(String name) {
        return new Foo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Foo rename(Name name) {
        return new Foo(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Foo rename(Table<?> name) {
        return new Foo(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Foo where(Condition condition) {
        return new Foo(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Foo where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Foo where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Foo where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Foo where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Foo where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Foo where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Foo where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Foo whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Foo whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
