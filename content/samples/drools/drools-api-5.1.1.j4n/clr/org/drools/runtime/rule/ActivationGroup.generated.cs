//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
//     Runtime Version:2.0.50727.4952
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace org.drools.runtime.rule {
    
    
    #region Component Designer generated code 
    [global::net.sf.jni4net.attributes.JavaInterfaceAttribute()]
    public partial interface ActivationGroup {
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()V")]
        void clear();
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Ljava/lang/String;")]
        global::java.lang.String getName();
    }
    #endregion
    
    #region Component Designer generated code 
    public partial class ActivationGroup_ {
        
        public static global::java.lang.Class _class {
            get {
                return global::org.drools.runtime.rule.@__ActivationGroup.staticClass;
            }
        }
    }
    #endregion
    
    #region Component Designer generated code 
    [global::net.sf.jni4net.attributes.JavaProxyAttribute(typeof(global::org.drools.runtime.rule.ActivationGroup), typeof(global::org.drools.runtime.rule.ActivationGroup_))]
    [global::net.sf.jni4net.attributes.ClrWrapperAttribute(typeof(global::org.drools.runtime.rule.ActivationGroup), typeof(global::org.drools.runtime.rule.ActivationGroup_))]
    internal sealed partial class @__ActivationGroup : global::java.lang.Object, global::org.drools.runtime.rule.ActivationGroup {
        
        internal new static global::java.lang.Class staticClass;
        
        internal static global::net.sf.jni4net.jni.MethodId _clear0;
        
        internal static global::net.sf.jni4net.jni.MethodId _getName1;
        
        private @__ActivationGroup(global::net.sf.jni4net.jni.JNIEnv @__env) : 
                base(@__env) {
        }
        
        private static void InitJNI(global::net.sf.jni4net.jni.JNIEnv @__env, java.lang.Class @__class) {
            global::org.drools.runtime.rule.@__ActivationGroup.staticClass = @__class;
            global::org.drools.runtime.rule.@__ActivationGroup._clear0 = @__env.GetMethodID(global::org.drools.runtime.rule.@__ActivationGroup.staticClass, "clear", "()V");
            global::org.drools.runtime.rule.@__ActivationGroup._getName1 = @__env.GetMethodID(global::org.drools.runtime.rule.@__ActivationGroup.staticClass, "getName", "()Ljava/lang/String;");
        }
        
        public void clear() {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
            @__env.CallVoidMethod(this, global::org.drools.runtime.rule.@__ActivationGroup._clear0);
            }
        }
        
        public global::java.lang.String getName() {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
            return global::net.sf.jni4net.utils.Convertor.StrongJ2CpString(@__env, @__env.CallObjectMethodPtr(this, global::org.drools.runtime.rule.@__ActivationGroup._getName1));
            }
        }
        
        private static global::System.Collections.Generic.List<global::net.sf.jni4net.jni.JNINativeMethod> @__Init(global::net.sf.jni4net.jni.JNIEnv @__env, global::java.lang.Class @__class) {
            global::System.Type @__type = typeof(__ActivationGroup);
            global::System.Collections.Generic.List<global::net.sf.jni4net.jni.JNINativeMethod> methods = new global::System.Collections.Generic.List<global::net.sf.jni4net.jni.JNINativeMethod>();
            methods.Add(global::net.sf.jni4net.jni.JNINativeMethod.Create(@__type, "clear", "clear0", "()V"));
            methods.Add(global::net.sf.jni4net.jni.JNINativeMethod.Create(@__type, "getName", "getName1", "()Ljava/lang/String;"));
            return methods;
        }
        
        private static void clear0(global::System.IntPtr @__envp, global::net.sf.jni4net.utils.JniLocalHandle @__obj) {
            // ()V
            // ()V
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.Wrap(@__envp);
            try {
            global::org.drools.runtime.rule.ActivationGroup @__real = global::net.sf.jni4net.utils.Convertor.FullJ2C<global::org.drools.runtime.rule.ActivationGroup>(@__env, @__obj);
            @__real.clear();
            }catch (global::System.Exception __ex){@__env.ThrowExisting(__ex);}
        }
        
        private static global::net.sf.jni4net.utils.JniHandle getName1(global::System.IntPtr @__envp, global::net.sf.jni4net.utils.JniLocalHandle @__obj) {
            // ()Ljava/lang/String;
            // ()Ljava/lang/String;
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.Wrap(@__envp);
            global::net.sf.jni4net.utils.JniHandle @__return = default(global::net.sf.jni4net.utils.JniHandle);
            try {
            global::org.drools.runtime.rule.ActivationGroup @__real = global::net.sf.jni4net.utils.Convertor.FullJ2C<global::org.drools.runtime.rule.ActivationGroup>(@__env, @__obj);
            @__return = global::net.sf.jni4net.utils.Convertor.StrongCp2J(@__real.getName());
            }catch (global::System.Exception __ex){@__env.ThrowExisting(__ex);}
            return @__return;
        }
        
        new internal sealed class ContructionHelper : global::net.sf.jni4net.utils.IConstructionHelper {
            
            public global::net.sf.jni4net.jni.IJvmProxy CreateProxy(global::net.sf.jni4net.jni.JNIEnv @__env) {
                return new global::org.drools.runtime.rule.@__ActivationGroup(@__env);
            }
        }
    }
    #endregion
}