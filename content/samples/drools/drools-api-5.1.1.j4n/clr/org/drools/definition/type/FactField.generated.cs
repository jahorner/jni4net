//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
//     Runtime Version:2.0.50727.4952
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace org.drools.definition.type {
    
    
    #region Component Designer generated code 
    [global::net.sf.jni4net.attributes.JavaInterfaceAttribute()]
    public partial interface FactField {
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Ljava/lang/String;")]
        global::java.lang.String getName();
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("(Ljava/lang/Object;)Ljava/lang/Object;")]
        global::java.lang.Object get(global::java.lang.Object par0);
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Ljava/lang/Class;")]
        global::java.lang.Class getType();
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("(Ljava/lang/Object;Ljava/lang/Object;)V")]
        void set(global::java.lang.Object par0, global::java.lang.Object par1);
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Z")]
        bool isKey();
    }
    #endregion
    
    #region Component Designer generated code 
    public partial class FactField_ {
        
        public static global::java.lang.Class _class {
            get {
                return global::org.drools.definition.type.@__FactField.staticClass;
            }
        }
    }
    #endregion
    
    #region Component Designer generated code 
    [global::net.sf.jni4net.attributes.JavaProxyAttribute(typeof(global::org.drools.definition.type.FactField), typeof(global::org.drools.definition.type.FactField_))]
    [global::net.sf.jni4net.attributes.ClrWrapperAttribute(typeof(global::org.drools.definition.type.FactField), typeof(global::org.drools.definition.type.FactField_))]
    internal sealed partial class @__FactField : global::java.lang.Object, global::org.drools.definition.type.FactField {
        
        internal new static global::java.lang.Class staticClass;
        
        internal static global::net.sf.jni4net.jni.MethodId _writeExternal0;
        
        internal static global::net.sf.jni4net.jni.MethodId _readExternal1;
        
        internal static global::net.sf.jni4net.jni.MethodId _getName2;
        
        internal static global::net.sf.jni4net.jni.MethodId _get3;
        
        internal static global::net.sf.jni4net.jni.MethodId _getType4;
        
        internal static global::net.sf.jni4net.jni.MethodId _set5;
        
        internal static global::net.sf.jni4net.jni.MethodId _isKey6;
        
        private @__FactField(global::net.sf.jni4net.jni.JNIEnv @__env) : 
                base(@__env) {
        }
        
        private static void InitJNI(global::net.sf.jni4net.jni.JNIEnv @__env, java.lang.Class @__class) {
            global::org.drools.definition.type.@__FactField.staticClass = @__class;
            global::org.drools.definition.type.@__FactField._writeExternal0 = @__env.GetMethodID(global::org.drools.definition.type.@__FactField.staticClass, "writeExternal", "(Ljava/io/ObjectOutput;)V");
            global::org.drools.definition.type.@__FactField._readExternal1 = @__env.GetMethodID(global::org.drools.definition.type.@__FactField.staticClass, "readExternal", "(Ljava/io/ObjectInput;)V");
            global::org.drools.definition.type.@__FactField._getName2 = @__env.GetMethodID(global::org.drools.definition.type.@__FactField.staticClass, "getName", "()Ljava/lang/String;");
            global::org.drools.definition.type.@__FactField._get3 = @__env.GetMethodID(global::org.drools.definition.type.@__FactField.staticClass, "get", "(Ljava/lang/Object;)Ljava/lang/Object;");
            global::org.drools.definition.type.@__FactField._getType4 = @__env.GetMethodID(global::org.drools.definition.type.@__FactField.staticClass, "getType", "()Ljava/lang/Class;");
            global::org.drools.definition.type.@__FactField._set5 = @__env.GetMethodID(global::org.drools.definition.type.@__FactField.staticClass, "set", "(Ljava/lang/Object;Ljava/lang/Object;)V");
            global::org.drools.definition.type.@__FactField._isKey6 = @__env.GetMethodID(global::org.drools.definition.type.@__FactField.staticClass, "isKey", "()Z");
        }
        
        public void writeExternal(global::java.lang.Object par0) {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 12)){
            @__env.CallVoidMethod(this, global::org.drools.definition.type.@__FactField._writeExternal0, global::net.sf.jni4net.utils.Convertor.ParFullC2J<global::java.lang.Object>(@__env, par0));
            }
        }
        
        public void readExternal(global::java.lang.Object par0) {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 12)){
            @__env.CallVoidMethod(this, global::org.drools.definition.type.@__FactField._readExternal1, global::net.sf.jni4net.utils.Convertor.ParFullC2J<global::java.lang.Object>(@__env, par0));
            }
        }
        
        public global::java.lang.String getName() {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
            return global::net.sf.jni4net.utils.Convertor.StrongJ2CpString(@__env, @__env.CallObjectMethodPtr(this, global::org.drools.definition.type.@__FactField._getName2));
            }
        }
        
        public global::java.lang.Object get(global::java.lang.Object par0) {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 12)){
            return global::net.sf.jni4net.utils.Convertor.FullJ2C<global::java.lang.Object>(@__env, @__env.CallObjectMethodPtr(this, global::org.drools.definition.type.@__FactField._get3, global::net.sf.jni4net.utils.Convertor.ParFullC2J<global::java.lang.Object>(@__env, par0)));
            }
        }
        
        public global::java.lang.Class getType() {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
            return global::net.sf.jni4net.utils.Convertor.StrongJ2CpClass(@__env, @__env.CallObjectMethodPtr(this, global::org.drools.definition.type.@__FactField._getType4));
            }
        }
        
        public void set(global::java.lang.Object par0, global::java.lang.Object par1) {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 14)){
            @__env.CallVoidMethod(this, global::org.drools.definition.type.@__FactField._set5, global::net.sf.jni4net.utils.Convertor.ParFullC2J<global::java.lang.Object>(@__env, par0), global::net.sf.jni4net.utils.Convertor.ParFullC2J<global::java.lang.Object>(@__env, par1));
            }
        }
        
        public bool isKey() {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
            return ((bool)(@__env.CallBooleanMethod(this, global::org.drools.definition.type.@__FactField._isKey6)));
            }
        }
        
        private static global::System.Collections.Generic.List<global::net.sf.jni4net.jni.JNINativeMethod> @__Init(global::net.sf.jni4net.jni.JNIEnv @__env, global::java.lang.Class @__class) {
            global::System.Type @__type = typeof(__FactField);
            global::System.Collections.Generic.List<global::net.sf.jni4net.jni.JNINativeMethod> methods = new global::System.Collections.Generic.List<global::net.sf.jni4net.jni.JNINativeMethod>();
            methods.Add(global::net.sf.jni4net.jni.JNINativeMethod.Create(@__type, "writeExternal", "writeExternal0", "(Ljava/io/ObjectOutput;)V"));
            methods.Add(global::net.sf.jni4net.jni.JNINativeMethod.Create(@__type, "readExternal", "readExternal1", "(Ljava/io/ObjectInput;)V"));
            methods.Add(global::net.sf.jni4net.jni.JNINativeMethod.Create(@__type, "getName", "getName2", "()Ljava/lang/String;"));
            methods.Add(global::net.sf.jni4net.jni.JNINativeMethod.Create(@__type, "get", "get3", "(Ljava/lang/Object;)Ljava/lang/Object;"));
            methods.Add(global::net.sf.jni4net.jni.JNINativeMethod.Create(@__type, "getType", "getType4", "()Ljava/lang/Class;"));
            methods.Add(global::net.sf.jni4net.jni.JNINativeMethod.Create(@__type, "set", "set5", "(Ljava/lang/Object;Ljava/lang/Object;)V"));
            methods.Add(global::net.sf.jni4net.jni.JNINativeMethod.Create(@__type, "isKey", "isKey6", "()Z"));
            return methods;
        }
        
        private static void writeExternal0(global::System.IntPtr @__envp, global::net.sf.jni4net.utils.JniLocalHandle @__obj, global::net.sf.jni4net.utils.JniLocalHandle par0) {
        }
        
        private static void readExternal1(global::System.IntPtr @__envp, global::net.sf.jni4net.utils.JniLocalHandle @__obj, global::net.sf.jni4net.utils.JniLocalHandle par0) {
        }
        
        private static global::net.sf.jni4net.utils.JniHandle getName2(global::System.IntPtr @__envp, global::net.sf.jni4net.utils.JniLocalHandle @__obj) {
            // ()Ljava/lang/String;
            // ()Ljava/lang/String;
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.Wrap(@__envp);
            global::net.sf.jni4net.utils.JniHandle @__return = default(global::net.sf.jni4net.utils.JniHandle);
            try {
            global::org.drools.definition.type.FactField @__real = global::net.sf.jni4net.utils.Convertor.FullJ2C<global::org.drools.definition.type.FactField>(@__env, @__obj);
            @__return = global::net.sf.jni4net.utils.Convertor.StrongCp2J(@__real.getName());
            }catch (global::System.Exception __ex){@__env.ThrowExisting(__ex);}
            return @__return;
        }
        
        private static global::net.sf.jni4net.utils.JniHandle get3(global::System.IntPtr @__envp, global::net.sf.jni4net.utils.JniLocalHandle @__obj, global::net.sf.jni4net.utils.JniLocalHandle par0) {
            // (Ljava/lang/Object;)Ljava/lang/Object;
            // (Ljava/lang/Object;)Ljava/lang/Object;
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.Wrap(@__envp);
            global::net.sf.jni4net.utils.JniHandle @__return = default(global::net.sf.jni4net.utils.JniHandle);
            try {
            global::org.drools.definition.type.FactField @__real = global::net.sf.jni4net.utils.Convertor.FullJ2C<global::org.drools.definition.type.FactField>(@__env, @__obj);
            @__return = global::net.sf.jni4net.utils.Convertor.FullC2J<global::java.lang.Object>(@__env, @__real.get(global::net.sf.jni4net.utils.Convertor.FullJ2C<global::java.lang.Object>(@__env, par0)));
            }catch (global::System.Exception __ex){@__env.ThrowExisting(__ex);}
            return @__return;
        }
        
        private static global::net.sf.jni4net.utils.JniHandle getType4(global::System.IntPtr @__envp, global::net.sf.jni4net.utils.JniLocalHandle @__obj) {
            // ()Ljava/lang/Class;
            // ()Ljava/lang/Class;
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.Wrap(@__envp);
            global::net.sf.jni4net.utils.JniHandle @__return = default(global::net.sf.jni4net.utils.JniHandle);
            try {
            global::org.drools.definition.type.FactField @__real = global::net.sf.jni4net.utils.Convertor.FullJ2C<global::org.drools.definition.type.FactField>(@__env, @__obj);
            @__return = global::net.sf.jni4net.utils.Convertor.StrongCp2J(@__real.getType());
            }catch (global::System.Exception __ex){@__env.ThrowExisting(__ex);}
            return @__return;
        }
        
        private static void set5(global::System.IntPtr @__envp, global::net.sf.jni4net.utils.JniLocalHandle @__obj, global::net.sf.jni4net.utils.JniLocalHandle par0, global::net.sf.jni4net.utils.JniLocalHandle par1) {
            // (Ljava/lang/Object;Ljava/lang/Object;)V
            // (Ljava/lang/Object;Ljava/lang/Object;)V
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.Wrap(@__envp);
            try {
            global::org.drools.definition.type.FactField @__real = global::net.sf.jni4net.utils.Convertor.FullJ2C<global::org.drools.definition.type.FactField>(@__env, @__obj);
            @__real.set(global::net.sf.jni4net.utils.Convertor.FullJ2C<global::java.lang.Object>(@__env, par0), global::net.sf.jni4net.utils.Convertor.FullJ2C<global::java.lang.Object>(@__env, par1));
            }catch (global::System.Exception __ex){@__env.ThrowExisting(__ex);}
        }
        
        private static bool isKey6(global::System.IntPtr @__envp, global::net.sf.jni4net.utils.JniLocalHandle @__obj) {
            // ()Z
            // ()Z
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.Wrap(@__envp);
            bool @__return = default(bool);
            try {
            global::org.drools.definition.type.FactField @__real = global::net.sf.jni4net.utils.Convertor.FullJ2C<global::org.drools.definition.type.FactField>(@__env, @__obj);
            @__return = ((bool)(@__real.isKey()));
            }catch (global::System.Exception __ex){@__env.ThrowExisting(__ex);}
            return @__return;
        }
        
        new internal sealed class ContructionHelper : global::net.sf.jni4net.utils.IConstructionHelper {
            
            public global::net.sf.jni4net.jni.IJvmProxy CreateProxy(global::net.sf.jni4net.jni.JNIEnv @__env) {
                return new global::org.drools.definition.type.@__FactField(@__env);
            }
        }
    }
    #endregion
}