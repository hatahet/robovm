/*
 * Copyright (C) 2012 RoboVM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.cocoatouch.foundation;

/*<imports>*/
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.bind.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/ObjC_classic/../Classes/NSObject_Class/Reference/Reference.html">NSObject Class Reference</a>
 *   @since Available in iOS 2.0 and later.
 * </div>
 */
/*<library>*/@Library("Foundation")/*</library>*/
public class /*<name>*/ NSObject /*</name>*/ 
    extends /*<extends>*/ ObjCObject /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ NSObject /*</name>*/.class);
    }

    private boolean customClass;

    public NSObject() {
        customClass = getObjCClass().isCustomClass();
    }

    @Override
    protected void afterMarshaled() {
        super.afterMarshaled();
        retain();
        customClass = getObjCClass().isCustomClass();
    }
    
    protected final boolean isCustomClass() {
        return customClass;
    }
    
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    
    protected long alloc() {
        return alloc(getObjCClass());
    }

    private static final Selector alloc = Selector.register("alloc");
    private static long alloc(ObjCClass c) {
        long h = ObjCRuntime.ptr_objc_msgSend(c.getHandle(), alloc.getHandle());
        if (h == 0L) {
            throw new OutOfMemoryError();
        }
        return h;
    }
    
    /*<methods>*/
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/ObjC_classic/../Protocols/NSObject_Protocol/Reference/NSObject.html#//apple_ref/occ/intfm/NSObject/description">- (NSString *)description</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("description") public native @Type("NSString *") String description();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/ObjC_classic/../Classes/NSObject_Class/Reference/Reference.html#//apple_ref/occ/instm/NSObject/init">- (id)init</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("init") protected native @Type("id") NSObject init();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/ObjC_classic/../Protocols/NSObject_Protocol/Reference/NSObject.html#//apple_ref/occ/intfm/NSObject/release">- (oneway void)release</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("release") protected native @Type("void") void release();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/ObjC_classic/../Protocols/NSObject_Protocol/Reference/NSObject.html#//apple_ref/occ/intfm/NSObject/retain">- (id)retain</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("retain") protected native @Type("id") NSObject retain();
    /*</methods>*/

}