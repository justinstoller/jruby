/*
 * Copyright (c) 2013, 2016 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0
 * GNU General Public License version 2
 * GNU Lesser General Public License version 2.1
 */
package org.jruby.truffle.core.hash;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.source.SourceSection;
import org.jruby.truffle.RubyContext;
import org.jruby.truffle.core.basicobject.BasicObjectForeignAccessFactory;
import org.jruby.truffle.interop.InteropNode;
import org.jruby.truffle.interop.RubyInteropRootNode;

public class HashForeignAccessFactory extends BasicObjectForeignAccessFactory {

    public HashForeignAccessFactory(RubyContext context) {
        super(context);
    }

    @Override
    public CallTarget accessIsNull() {
        return Truffle.getRuntime().createCallTarget(new RubyInteropRootNode(InteropNode.createIsNull(context, SourceSection.createUnavailable("", ""))));
    }

    @Override
    public CallTarget accessIsExecutable() {
        return Truffle.getRuntime().createCallTarget(new RubyInteropRootNode(InteropNode.createIsExecutable(context, SourceSection.createUnavailable("", ""))));
    }

    @Override
    public CallTarget accessIsBoxed() {
        return Truffle.getRuntime().createCallTarget(new RubyInteropRootNode(InteropNode.createIsBoxedPrimitive(context, SourceSection.createUnavailable("", ""))));
    }

    @Override
    public CallTarget accessHasSize() {
        return Truffle.getRuntime().createCallTarget(new RubyInteropRootNode(InteropNode.createHasSizePropertyTrue(context, SourceSection.createUnavailable("", ""))));
    }

    @Override
    public CallTarget accessGetSize() {
        return Truffle.getRuntime().createCallTarget(new RubyInteropRootNode(InteropNode.createGetSize(context, SourceSection.createUnavailable("", ""))));
    }

    @Override
    public CallTarget accessUnbox() {
        return Truffle.getRuntime().createCallTarget(new RubyInteropRootNode(InteropNode.createIsBoxedPrimitive(context, SourceSection.createUnavailable("", ""))));
    }

    @Override
    public CallTarget accessRead() {
        return Truffle.getRuntime().createCallTarget(new RubyInteropRootNode(InteropNode.createRead(context, SourceSection.createUnavailable("", ""))));
    }

    @Override
    public CallTarget accessWrite() {
        return Truffle.getRuntime().createCallTarget(new RubyInteropRootNode(InteropNode.createWrite(context, SourceSection.createUnavailable("", ""))));
    }

    @Override
    public CallTarget accessExecute(int i) {
        return null;
    }

    @Override
    public CallTarget accessInvoke(int arity) {
        return Truffle.getRuntime().createCallTarget(new RubyInteropRootNode(InteropNode.createExecuteAfterRead(context, SourceSection.createUnavailable("", ""), arity)));
    }

}
