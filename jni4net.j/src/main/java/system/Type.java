// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package system;

@net.sf.jni4net.attributes.ClrType
public abstract class Type extends system.reflection.MemberInfo {
    
    //<generated-proxy>
    private static system.Type staticType;
    
    protected Type(net.sf.jni4net.inj.INJEnv env, int handle) {
            super(env, handle);
    }
    
    protected Type() {
            super(((net.sf.jni4net.inj.INJEnv)(null)), 0);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Reflection/MethodBase;")
    public native system.reflection.MethodBase getDeclaringMethod();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;ZZ)LSystem/Type;")
    public native static system.Type GetType(java.lang.String typeName, boolean throwOnError, boolean ignoreCase);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;Z)LSystem/Type;")
    public native static system.Type GetType(java.lang.String typeName, boolean throwOnError);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)LSystem/Type;")
    public native static system.Type GetType(java.lang.String typeName);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;ZZ)LSystem/Type;")
    public native static system.Type ReflectionOnlyGetType(java.lang.String typeName, boolean throwIfNotFound, boolean ignoreCase);
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Type;")
    public native system.Type MakePointerType();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Runtime/InteropServices/StructLayoutAttribute;")
    public native java.lang.Object getStructLayoutAttribute();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Type;")
    public native system.Type MakeByRefType();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Type;")
    public native system.Type MakeArrayType();
    
    @net.sf.jni4net.attributes.ClrMethod("(I)LSystem/Type;")
    public native system.Type MakeArrayType(int rank);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)LSystem/Type;")
    public native static system.Type GetTypeFromProgID(java.lang.String progID);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;Z)LSystem/Type;")
    public native static system.Type GetTypeFromProgID(java.lang.String progID, boolean throwOnError);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/String;)LSystem/Type;")
    public native static system.Type GetTypeFromProgID(java.lang.String progID, java.lang.String server);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/String;Z)LSystem/Type;")
    public native static system.Type GetTypeFromProgID(java.lang.String progID, java.lang.String server, boolean throwOnError);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Guid;)LSystem/Type;")
    public native static system.Type GetTypeFromCLSID(system.Guid clsid);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Guid;Z)LSystem/Type;")
    public native static system.Type GetTypeFromCLSID(system.Guid clsid, boolean throwOnError);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Guid;LSystem/String;)LSystem/Type;")
    public native static system.Type GetTypeFromCLSID(system.Guid clsid, java.lang.String server);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Guid;LSystem/String;Z)LSystem/Type;")
    public native static system.Type GetTypeFromCLSID(system.Guid clsid, java.lang.String server, boolean throwOnError);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Type;)LSystem/TypeCode;")
    public native static system.Enum GetTypeCode(system.Type type);
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Guid;")
    public native system.Guid getGUID();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Reflection/Binder;")
    public native static java.lang.Object getDefaultBinder();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Reflection/BindingFlags;LSystem/Reflection/Binder;LSystem/Object;[LSystem/Object;[LSystem/Reflection/ParameterModifier;LSystem/Globalization/CultureInfo;[LSystem/String;)LSystem/Object;")
    public native system.Object InvokeMember(java.lang.String name, system.reflection.BindingFlags invokeAttr, java.lang.Object binder, system.Object target, system.Object[] args, system.ValueType[] modifiers, system.ICloneable culture, system.String[] namedParameters);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Reflection/BindingFlags;LSystem/Reflection/Binder;LSystem/Object;[LSystem/Object;LSystem/Globalization/CultureInfo;)LSystem/Object;")
    public native system.Object InvokeMember(java.lang.String name, system.reflection.BindingFlags invokeAttr, java.lang.Object binder, system.Object target, system.Object[] args, system.ICloneable culture);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Reflection/BindingFlags;LSystem/Reflection/Binder;LSystem/Object;[LSystem/Object;)LSystem/Object;")
    public native system.Object InvokeMember(java.lang.String name, system.reflection.BindingFlags invokeAttr, java.lang.Object binder, system.Object target, system.Object[] args);
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Reflection/Assembly;")
    public native system.reflection.Assembly getAssembly();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/RuntimeTypeHandle;")
    public native system.ValueType getTypeHandle();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Object;)LSystem/RuntimeTypeHandle;")
    public native static system.ValueType GetTypeHandle(system.Object o);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/RuntimeTypeHandle;)LSystem/Type;")
    public native static system.Type GetTypeFromHandle(system.ValueType handle);
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/String;")
    public native java.lang.String getFullName();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/String;")
    public native java.lang.String getNamespace();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/String;")
    public native java.lang.String getAssemblyQualifiedName();
    
    @net.sf.jni4net.attributes.ClrMethod("()I")
    public native int GetArrayRank();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Type;")
    public native system.Type getBaseType();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Reflection/BindingFlags;LSystem/Reflection/Binder;LSystem/Reflection/CallingConventions;[LSystem/Type;[LSystem/Reflection/ParameterModifier;)LSystem/Reflection/ConstructorInfo;")
    public native system.reflection.ConstructorInfo GetConstructor(system.reflection.BindingFlags bindingAttr, java.lang.Object binder, system.Enum callConvention, system.Type[] types, system.ValueType[] modifiers);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Reflection/BindingFlags;LSystem/Reflection/Binder;[LSystem/Type;[LSystem/Reflection/ParameterModifier;)LSystem/Reflection/ConstructorInfo;")
    public native system.reflection.ConstructorInfo GetConstructor(system.reflection.BindingFlags bindingAttr, java.lang.Object binder, system.Type[] types, system.ValueType[] modifiers);
    
    @net.sf.jni4net.attributes.ClrMethod("([LSystem/Type;)LSystem/Reflection/ConstructorInfo;")
    public native system.reflection.ConstructorInfo GetConstructor(system.Type[] types);
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Reflection/ConstructorInfo;")
    public native system.reflection.ConstructorInfo[] GetConstructors();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Reflection/BindingFlags;)[LSystem/Reflection/ConstructorInfo;")
    public native system.reflection.ConstructorInfo[] GetConstructors(system.reflection.BindingFlags bindingAttr);
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Reflection/ConstructorInfo;")
    public native system.reflection.ConstructorInfo getTypeInitializer();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Reflection/BindingFlags;LSystem/Reflection/Binder;LSystem/Reflection/CallingConventions;[LSystem/Type;[LSystem/Reflection/ParameterModifier;)LSystem/Reflection/MethodInfo;")
    public native system.reflection.MethodInfo GetMethod(java.lang.String name, system.reflection.BindingFlags bindingAttr, java.lang.Object binder, system.Enum callConvention, system.Type[] types, system.ValueType[] modifiers);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Reflection/BindingFlags;LSystem/Reflection/Binder;[LSystem/Type;[LSystem/Reflection/ParameterModifier;)LSystem/Reflection/MethodInfo;")
    public native system.reflection.MethodInfo GetMethod(java.lang.String name, system.reflection.BindingFlags bindingAttr, java.lang.Object binder, system.Type[] types, system.ValueType[] modifiers);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;[LSystem/Type;[LSystem/Reflection/ParameterModifier;)LSystem/Reflection/MethodInfo;")
    public native system.reflection.MethodInfo GetMethod(java.lang.String name, system.Type[] types, system.ValueType[] modifiers);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;[LSystem/Type;)LSystem/Reflection/MethodInfo;")
    public native system.reflection.MethodInfo GetMethod(java.lang.String name, system.Type[] types);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Reflection/BindingFlags;)LSystem/Reflection/MethodInfo;")
    public native system.reflection.MethodInfo GetMethod(java.lang.String name, system.reflection.BindingFlags bindingAttr);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)LSystem/Reflection/MethodInfo;")
    public native system.reflection.MethodInfo GetMethod(java.lang.String name);
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Reflection/MethodInfo;")
    public native system.reflection.MethodInfo[] GetMethods();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Reflection/BindingFlags;)[LSystem/Reflection/MethodInfo;")
    public native system.reflection.MethodInfo[] GetMethods(system.reflection.BindingFlags bindingAttr);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Reflection/BindingFlags;)LSystem/Reflection/FieldInfo;")
    public native system.reflection.FieldInfo GetField(java.lang.String name, system.reflection.BindingFlags bindingAttr);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)LSystem/Reflection/FieldInfo;")
    public native system.reflection.FieldInfo GetField(java.lang.String name);
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Reflection/FieldInfo;")
    public native system.reflection.FieldInfo[] GetFields();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Reflection/BindingFlags;)[LSystem/Reflection/FieldInfo;")
    public native system.reflection.FieldInfo[] GetFields(system.reflection.BindingFlags bindingAttr);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)LSystem/Type;")
    public native system.Type GetInterface(java.lang.String name);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;Z)LSystem/Type;")
    public native system.Type GetInterface(java.lang.String name, boolean ignoreCase);
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Type;")
    public native system.Type[] GetInterfaces();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)LSystem/Reflection/EventInfo;")
    public native system.reflection.MemberInfo GetEvent(java.lang.String name);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Reflection/BindingFlags;)LSystem/Reflection/EventInfo;")
    public native system.reflection.MemberInfo GetEvent(java.lang.String name, system.reflection.BindingFlags bindingAttr);
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Reflection/EventInfo;")
    public native system.reflection.MemberInfo[] GetEvents();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Reflection/BindingFlags;)[LSystem/Reflection/EventInfo;")
    public native system.reflection.MemberInfo[] GetEvents(system.reflection.BindingFlags bindingAttr);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Reflection/BindingFlags;LSystem/Reflection/Binder;LSystem/Type;[LSystem/Type;[LSystem/Reflection/ParameterModifier;)LSystem/Reflection/PropertyInfo;")
    public native system.reflection.PropertyInfo GetProperty(java.lang.String name, system.reflection.BindingFlags bindingAttr, java.lang.Object binder, system.Type returnType, system.Type[] types, system.ValueType[] modifiers);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Type;[LSystem/Type;[LSystem/Reflection/ParameterModifier;)LSystem/Reflection/PropertyInfo;")
    public native system.reflection.PropertyInfo GetProperty(java.lang.String name, system.Type returnType, system.Type[] types, system.ValueType[] modifiers);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Reflection/BindingFlags;)LSystem/Reflection/PropertyInfo;")
    public native system.reflection.PropertyInfo GetProperty(java.lang.String name, system.reflection.BindingFlags bindingAttr);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Type;[LSystem/Type;)LSystem/Reflection/PropertyInfo;")
    public native system.reflection.PropertyInfo GetProperty(java.lang.String name, system.Type returnType, system.Type[] types);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;[LSystem/Type;)LSystem/Reflection/PropertyInfo;")
    public native system.reflection.PropertyInfo GetProperty(java.lang.String name, system.Type[] types);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Type;)LSystem/Reflection/PropertyInfo;")
    public native system.reflection.PropertyInfo GetProperty(java.lang.String name, system.Type returnType);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)LSystem/Reflection/PropertyInfo;")
    public native system.reflection.PropertyInfo GetProperty(java.lang.String name);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Reflection/BindingFlags;)[LSystem/Reflection/PropertyInfo;")
    public native system.reflection.PropertyInfo[] GetProperties(system.reflection.BindingFlags bindingAttr);
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Reflection/PropertyInfo;")
    public native system.reflection.PropertyInfo[] GetProperties();
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Type;")
    public native system.Type[] GetNestedTypes();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Reflection/BindingFlags;)[LSystem/Type;")
    public native system.Type[] GetNestedTypes(system.reflection.BindingFlags bindingAttr);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)LSystem/Type;")
    public native system.Type GetNestedType(java.lang.String name);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Reflection/BindingFlags;)LSystem/Type;")
    public native system.Type GetNestedType(java.lang.String name, system.reflection.BindingFlags bindingAttr);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;)[LSystem/Reflection/MemberInfo;")
    public native system.reflection.MemberInfo[] GetMember(java.lang.String name);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Reflection/BindingFlags;)[LSystem/Reflection/MemberInfo;")
    public native system.reflection.MemberInfo[] GetMember(java.lang.String name, system.reflection.BindingFlags bindingAttr);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/String;LSystem/Reflection/MemberTypes;LSystem/Reflection/BindingFlags;)[LSystem/Reflection/MemberInfo;")
    public native system.reflection.MemberInfo[] GetMember(java.lang.String name, system.Enum type, system.reflection.BindingFlags bindingAttr);
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Reflection/MemberInfo;")
    public native system.reflection.MemberInfo[] GetMembers();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Reflection/BindingFlags;)[LSystem/Reflection/MemberInfo;")
    public native system.reflection.MemberInfo[] GetMembers(system.reflection.BindingFlags bindingAttr);
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Reflection/MemberInfo;")
    public native system.reflection.MemberInfo[] GetDefaultMembers();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native final boolean isNested();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Reflection/TypeAttributes;")
    public native system.Enum getAttributes();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Reflection/GenericParameterAttributes;")
    public native system.Enum getGenericParameterAttributes();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native final boolean isVisible();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isNotPublic();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isPublic();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isNestedPublic();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isNestedPrivate();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isNestedFamily();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isNestedAssembly();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isNestedFamANDAssem();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isNestedFamORAssem();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isAutoLayout();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isLayoutSequential();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isExplicitLayout();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isClass();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isInterface();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isValueType();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isAbstract();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isSealed();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isEnum();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isSpecialName();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isImport();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isSerializable();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isAnsiClass();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isUnicodeClass();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isAutoClass();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isArray();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isGenericType();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isGenericTypeDefinition();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isGenericParameter();
    
    @net.sf.jni4net.attributes.ClrMethod("()I")
    public native int getGenericParameterPosition();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean getContainsGenericParameters();
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Type;")
    public native system.Type[] GetGenericParameterConstraints();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isByRef();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isPointer();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isPrimitive();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isCOMObject();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean getHasElementType();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isContextful();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isMarshalByRef();
    
    @net.sf.jni4net.attributes.ClrMethod("([LSystem/Type;)LSystem/Type;")
    public native system.Type MakeGenericType(system.Type[] typeArguments);
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Type;")
    public native system.Type GetElementType();
    
    @net.sf.jni4net.attributes.ClrMethod("()[LSystem/Type;")
    public native system.Type[] GetGenericArguments();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Type;")
    public native system.Type GetGenericTypeDefinition();
    
    @net.sf.jni4net.attributes.ClrMethod("()LSystem/Type;")
    public native system.Type getUnderlyingSystemType();
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Type;)Z")
    public native boolean IsSubclassOf(system.Type c);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Object;)Z")
    public native boolean IsInstanceOfType(system.Object o);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Type;)Z")
    public native boolean IsAssignableFrom(system.Type c);
    
    @net.sf.jni4net.attributes.ClrMethod("([LSystem/Object;)[LSystem/Type;")
    public native static system.Type[] GetTypeArray(system.Object[] args);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Type;)Z")
    public native boolean Equals(system.Type o);
    
    @net.sf.jni4net.attributes.ClrMethod("(LSystem/Type;)LSystem/Reflection/InterfaceMapping;")
    public native system.ValueType GetInterfaceMap(system.Type interfaceType);
    
    public static system.Type typeof() {
        return system.Type.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        system.Type.staticType = staticType;
    }
    //</generated-proxy>
}
