// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package system.reflection;

@net.sf.jni4net.attributes.ClrType
public abstract class PropertyInfo extends system.reflection.MemberInfo {
    
    //<generated-proxy>
    private static system.Type staticType;
    
    protected PropertyInfo(net.sf.jni4net.inj.INJEnv env, int handle) {
            super(env, handle);
    }
    
    protected PropertyInfo() {
            super(((net.sf.jni4net.inj.INJEnv)(null)), 0);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Object;")
    public native system.Object GetConstantValue();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Object;")
    public native system.Object GetRawConstantValue();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Type;")
    public native system.Type getPropertyType();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Object;LSystem/Object;LSystem/Reflection/BindingFlags;LSystem/Reflection/Binder;[LSystem/Object;LSystem/Globalization/CultureInfo;)V")
    public native void SetValue(system.Object obj, system.Object value, system.reflection.BindingFlags invokeAttr, java.lang.Object binder, system.Object[] index, system.ICloneable culture);
    
    @net.sf.jni4net.attributes.ClrMethod("(Z)[LSystem/Reflection/MethodInfo;")
    public native system.reflection.MethodInfo[] GetAccessors(boolean nonPublic);
    
    @net.sf.jni4net.attributes.ClrMethod("(Z)LSystem/Reflection/MethodInfo;")
    public native system.reflection.MethodInfo GetGetMethod(boolean nonPublic);
    
    @net.sf.jni4net.attributes.ClrMethod("(Z)LSystem/Reflection/MethodInfo;")
    public native system.reflection.MethodInfo GetSetMethod(boolean nonPublic);
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Reflection/ParameterInfo;")
    public native system.reflection.ParameterInfo[] GetIndexParameters();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Reflection/PropertyAttributes;")
    public native system.Enum getAttributes();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean getCanRead();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean getCanWrite();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Object;[LSystem/Object;)LSystem/Object;")
    public native system.Object GetValue(system.Object obj, system.Object[] index);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Object;LSystem/Reflection/BindingFlags;LSystem/Reflection/Binder;[LSystem/Object;LSystem/Globalization/CultureInfo;)LSystem/Object;")
    public native system.Object GetValue(system.Object obj, system.reflection.BindingFlags invokeAttr, java.lang.Object binder, system.Object[] index, system.ICloneable culture);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Object;LSystem/Object;[LSystem/Object;)V")
    public native void SetValue(system.Object obj, system.Object value, system.Object[] index);
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Type;")
    public native system.Type[] GetRequiredCustomModifiers();
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Type;")
    public native system.Type[] GetOptionalCustomModifiers();
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Reflection/MethodInfo;")
    public native system.reflection.MethodInfo[] GetAccessors();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Reflection/MethodInfo;")
    public native system.reflection.MethodInfo GetGetMethod();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Reflection/MethodInfo;")
    public native system.reflection.MethodInfo GetSetMethod();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isSpecialName();
    
    public static system.Type typeof() {
        return system.reflection.PropertyInfo.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        system.reflection.PropertyInfo.staticType = staticType;
    }
    //</generated-proxy>
}
