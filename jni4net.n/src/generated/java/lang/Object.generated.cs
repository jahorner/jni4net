//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
//     Runtime Version:2.0.50727.3074
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace java.lang {
    
    
    #region Component Designer generated code 
    [global::net.sf.jni4net.attributes.JavaClassAttribute()]
    public unsafe partial class Object : global::System.IDisposable {
        
        internal static global::java.lang.Class staticClass;
        
        internal static global::net.sf.jni4net.jni.MethodId _wait1;
        
        internal static global::net.sf.jni4net.jni.MethodId _wait2;
        
        internal static global::net.sf.jni4net.jni.MethodId _wait3;
        
        internal static global::net.sf.jni4net.jni.MethodId _hashCode4;
        
        internal static global::net.sf.jni4net.jni.MethodId _getClass5;
        
        internal static global::net.sf.jni4net.jni.MethodId _equals6;
        
        internal static global::net.sf.jni4net.jni.MethodId _toString7;
        
        internal static global::net.sf.jni4net.jni.MethodId _notify8;
        
        internal static global::net.sf.jni4net.jni.MethodId _notifyAll9;
        
        internal static global::net.sf.jni4net.jni.MethodId @__ctor10;
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()V")]
        public Object() {
            global::net.sf.jni4net.jni.JNIEnv env = global::net.sf.jni4net.jni.JNIEnv.GetEnv();
            env.NewObject(global::java.lang.Object.staticClass, global::java.lang.Object.@__ctor10, this);
        }
        
        public new static global::java.lang.Class _class {
            get {
                return global::java.lang.Object.staticClass;
            }
        }
        
        private static void InitJNI(global::net.sf.jni4net.jni.JNIEnv env, java.lang.Class staticClass) {
            global::java.lang.Object.staticClass = staticClass;
            global::java.lang.Object._wait1 = env.GetMethodID(global::java.lang.Object.staticClass, "wait", "()V");
            global::java.lang.Object._wait2 = env.GetMethodID(global::java.lang.Object.staticClass, "wait", "(JI)V");
            global::java.lang.Object._wait3 = env.GetMethodID(global::java.lang.Object.staticClass, "wait", "(J)V");
            global::java.lang.Object._hashCode4 = env.GetMethodID(global::java.lang.Object.staticClass, "hashCode", "()I");
            global::java.lang.Object._getClass5 = env.GetMethodID(global::java.lang.Object.staticClass, "getClass", "()Ljava/lang/Class;");
            global::java.lang.Object._equals6 = env.GetMethodID(global::java.lang.Object.staticClass, "equals", "(Ljava/lang/Object;)Z");
            global::java.lang.Object._toString7 = env.GetMethodID(global::java.lang.Object.staticClass, "toString", "()Ljava/lang/String;");
            global::java.lang.Object._notify8 = env.GetMethodID(global::java.lang.Object.staticClass, "notify", "()V");
            global::java.lang.Object._notifyAll9 = env.GetMethodID(global::java.lang.Object.staticClass, "notifyAll", "()V");
            global::java.lang.Object.@__ctor10 = env.GetMethodID(global::java.lang.Object.staticClass, "<init>", "()V");
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()V")]
        public void wait() {
            global::net.sf.jni4net.jni.JNIEnv env = this.Env;
            env.CallVoidMethod(this, global::java.lang.Object._wait1);
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("(JI)V")]
        public void wait(long par0, int par1) {
            global::net.sf.jni4net.jni.JNIEnv env = this.Env;
            env.CallVoidMethod(this, global::java.lang.Object._wait2, new global::net.sf.jni4net.jni.Value(par0), new global::net.sf.jni4net.jni.Value(par1));
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("(J)V")]
        public void wait(long par0) {
            global::net.sf.jni4net.jni.JNIEnv env = this.Env;
            env.CallVoidMethod(this, global::java.lang.Object._wait3, new global::net.sf.jni4net.jni.Value(par0));
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()I")]
        public virtual int hashCode() {
            global::net.sf.jni4net.jni.JNIEnv env = this.Env;
            return env.CallIntMethod(this, global::java.lang.Object._hashCode4);
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Ljava/lang/Class;")]
        public global::java.lang.Class getClass() {
            global::net.sf.jni4net.jni.JNIEnv env = this.Env;
            return global::net.sf.jni4net.Bridge.ToCLR<global::java.lang.Class>(env.CallObjectMethod(this, global::java.lang.Object._getClass5));
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("(Ljava/lang/Object;)Z")]
        public virtual bool equals(global::java.lang.Object par0) {
            global::net.sf.jni4net.jni.JNIEnv env = this.Env;
            return env.CallBooleanMethod(this, global::java.lang.Object._equals6, new global::net.sf.jni4net.jni.Value(par0));
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Ljava/lang/String;")]
        public virtual global::java.lang.String toString() {
            global::net.sf.jni4net.jni.JNIEnv env = this.Env;
            return global::net.sf.jni4net.Bridge.ToCLR<global::java.lang.String>(env.CallObjectMethod(this, global::java.lang.Object._toString7));
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()V")]
        public void notify() {
            global::net.sf.jni4net.jni.JNIEnv env = this.Env;
            env.CallVoidMethod(this, global::java.lang.Object._notify8);
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()V")]
        public void notifyAll() {
            global::net.sf.jni4net.jni.JNIEnv env = this.Env;
            env.CallVoidMethod(this, global::java.lang.Object._notifyAll9);
        }
        
        internal sealed class ContructionHelper : global::net.sf.jni4net.utils.IConstructionHelper {
            
            public global::net.sf.jni4net.jni.IJavaProxy CreateProxy(global::net.sf.jni4net.jni.JNIEnv env) {
                return new global::java.lang.Object(env);
            }
        }
    }
    #endregion
}
