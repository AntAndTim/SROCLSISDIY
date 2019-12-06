package ast;

public class StandardLibrary {
    public static final String LIB = ".assembly extern mscorlib\n" +
            "{\n" +
            "  .publickeytoken = (B7 7A 5C 56 19 34 E0 89 )                         // .z\\V.4..\n" +
            "  .ver 4:0:0:0\n" +
            "}\n" +
            "\n" +
            ".class public auto ansi beforefieldinit Class\n" +
            "       extends [mscorlib]System.Object\n" +
            "{\n" +
            "  .method public hidebysig specialname rtspecialname \n" +
            "          instance void  .ctor() cil managed\n" +
            "  {\n" +
            "    // Code size       8 (0x8)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  ldarg.0\n" +
            "    IL_0001:  call       instance void [mscorlib]System.Object::.ctor()\n" +
            "    IL_0006:  nop\n" +
            "    IL_0007:  ret\n" +
            "  } // end of method Class::.ctor\n" +
            "\n" +
            "} // end of class Class\n" +
            "\n" +
            ".class public auto ansi beforefieldinit AnyValue\n" +
            "       extends Class\n" +
            "{\n" +
            "  .field public uint8[] _value\n" +
            "  .method public hidebysig specialname rtspecialname \n" +
            "          instance void  .ctor() cil managed\n" +
            "  {\n" +
            "    // Code size       8 (0x8)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  ldarg.0\n" +
            "    IL_0001:  call       instance void Class::.ctor()\n" +
            "    IL_0006:  nop\n" +
            "    IL_0007:  ret\n" +
            "  } // end of method AnyValue::.ctor\n" +
            "\n" +
            "} // end of class AnyValue\n" +
            "\n" +
            ".class public auto ansi beforefieldinit AnyRef\n" +
            "       extends Class\n" +
            "{\n" +
            "  .method public hidebysig specialname rtspecialname \n" +
            "          instance void  .ctor() cil managed\n" +
            "  {\n" +
            "    // Code size       8 (0x8)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  ldarg.0\n" +
            "    IL_0001:  call       instance void Class::.ctor()\n" +
            "    IL_0006:  nop\n" +
            "    IL_0007:  ret\n" +
            "  } // end of method AnyRef::.ctor\n" +
            "\n" +
            "} // end of class AnyRef\n" +
            "\n" +
            ".class public auto ansi beforefieldinit Printer\n" +
            "       extends [mscorlib]System.Object\n" +
            "{\n" +
            "  .method public hidebysig specialname rtspecialname \n" +
            "          instance void  .ctor() cil managed\n" +
            "  {\n" +
            "    // Code size       9 (0x9)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  ldarg.0\n" +
            "    IL_0001:  call       instance void [mscorlib]System.Object::.ctor()\n" +
            "    IL_0006:  nop\n" +
            "    IL_0007:  nop\n" +
            "    IL_0008:  ret\n" +
            "  } // end of method Printer::.ctor\n" +
            "\n" +
            "  .method public hidebysig instance void \n" +
            "          Print(class Integer v) cil managed\n" +
            "  {\n" +
            "    // Code size       20 (0x14)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.1\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  call       void [mscorlib]System.Console::WriteLine(int32)\n" +
            "    IL_0012:  nop\n" +
            "    IL_0013:  ret\n" +
            "  } // end of method Printer::Print\n" +
            "\n" +
            "  .method public hidebysig instance void \n" +
            "          Print(class Real v) cil managed\n" +
            "  {\n" +
            "    // Code size       20 (0x14)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.1\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  call       void [mscorlib]System.Console::WriteLine(float64)\n" +
            "    IL_0012:  nop\n" +
            "    IL_0013:  ret\n" +
            "  } // end of method Printer::Print\n" +
            "\n" +
            "} // end of class Printer\n" +
            "\n" +
            ".class public auto ansi beforefieldinit RefArray`1<T>\n" +
            "       extends AnyRef\n" +
            "{\n" +
            "  .field family !T[] 'array'\n" +
            "  .method public hidebysig specialname rtspecialname \n" +
            "          instance void  .ctor(int32 l) cil managed\n" +
            "  {\n" +
            "    // Code size       21 (0x15)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  ldarg.0\n" +
            "    IL_0001:  call       instance void AnyRef::.ctor()\n" +
            "    IL_0006:  nop\n" +
            "    IL_0007:  nop\n" +
            "    IL_0008:  ldarg.0\n" +
            "    IL_0009:  ldarg.1\n" +
            "    IL_000a:  newarr     !T\n" +
            "    IL_000f:  stfld      !0[] class RefArray`1<!T>::'array'\n" +
            "    IL_0014:  ret\n" +
            "  } // end of method RefArray`1::.ctor\n" +
            "\n" +
            "  .method public hidebysig instance class RefList`1<!T> \n" +
            "          toList() cil managed\n" +
            "  {\n" +
            "    // Code size       17 (0x11)\n" +
            "    .maxstack  1\n" +
            "    .locals init (class RefList`1<!T> V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      !0[] class RefArray`1<!T>::'array'\n" +
            "    IL_0007:  newobj     instance void class RefList`1<!T>::.ctor(!0[])\n" +
            "    IL_000c:  stloc.0\n" +
            "    IL_000d:  br.s       IL_000f\n" +
            "\n" +
            "    IL_000f:  ldloc.0\n" +
            "    IL_0010:  ret\n" +
            "  } // end of method RefArray`1::toList\n" +
            "\n" +
            "  .method public hidebysig instance int32 \n" +
            "          Length() cil managed\n" +
            "  {\n" +
            "    // Code size       14 (0xe)\n" +
            "    .maxstack  1\n" +
            "    .locals init (int32 V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      !0[] class RefArray`1<!T>::'array'\n" +
            "    IL_0007:  ldlen\n" +
            "    IL_0008:  conv.i4\n" +
            "    IL_0009:  stloc.0\n" +
            "    IL_000a:  br.s       IL_000c\n" +
            "\n" +
            "    IL_000c:  ldloc.0\n" +
            "    IL_000d:  ret\n" +
            "  } // end of method RefArray`1::Length\n" +
            "\n" +
            "  .method public hidebysig instance !T  get(int32 i) cil managed\n" +
            "  {\n" +
            "    // Code size       18 (0x12)\n" +
            "    .maxstack  2\n" +
            "    .locals init (!T V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      !0[] class RefArray`1<!T>::'array'\n" +
            "    IL_0007:  ldarg.1\n" +
            "    IL_0008:  ldelem     !T\n" +
            "    IL_000d:  stloc.0\n" +
            "    IL_000e:  br.s       IL_0010\n" +
            "\n" +
            "    IL_0010:  ldloc.0\n" +
            "    IL_0011:  ret\n" +
            "  } // end of method RefArray`1::get\n" +
            "\n" +
            "  .method public hidebysig instance void \n" +
            "          set(int32 i,\n" +
            "              !T v) cil managed\n" +
            "  {\n" +
            "    // Code size       15 (0xf)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      !0[] class RefArray`1<!T>::'array'\n" +
            "    IL_0007:  ldarg.1\n" +
            "    IL_0008:  ldarg.2\n" +
            "    IL_0009:  stelem     !T\n" +
            "    IL_000e:  ret\n" +
            "  } // end of method RefArray`1::set\n" +
            "\n" +
            "} // end of class RefArray`1\n" +
            "\n" +
            ".class public auto ansi beforefieldinit RefList`1<T>\n" +
            "       extends AnyRef\n" +
            "{\n" +
            "  .field family class [mscorlib]System.Collections.Generic.List`1<!T> list\n" +
            "  .method public hidebysig specialname rtspecialname \n" +
            "          instance void  .ctor() cil managed\n" +
            "  {\n" +
            "    // Code size       20 (0x14)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  ldarg.0\n" +
            "    IL_0001:  call       instance void AnyRef::.ctor()\n" +
            "    IL_0006:  nop\n" +
            "    IL_0007:  nop\n" +
            "    IL_0008:  ldarg.0\n" +
            "    IL_0009:  newobj     instance void class [mscorlib]System.Collections.Generic.List`1<!T>::.ctor()\n" +
            "    IL_000e:  stfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list\n" +
            "    IL_0013:  ret\n" +
            "  } // end of method RefList`1::.ctor\n" +
            "\n" +
            "  .method public hidebysig specialname rtspecialname \n" +
            "          instance void  .ctor(!T[] arr) cil managed\n" +
            "  {\n" +
            "    // Code size       21 (0x15)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  ldarg.0\n" +
            "    IL_0001:  call       instance void AnyRef::.ctor()\n" +
            "    IL_0006:  nop\n" +
            "    IL_0007:  nop\n" +
            "    IL_0008:  ldarg.0\n" +
            "    IL_0009:  ldarg.1\n" +
            "    IL_000a:  newobj     instance void class [mscorlib]System.Collections.Generic.List`1<!T>::.ctor(class [mscorlib]System.Collections.Generic.IEnumerable`1<!0>)\n" +
            "    IL_000f:  stfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list\n" +
            "    IL_0014:  ret\n" +
            "  } // end of method RefList`1::.ctor\n" +
            "\n" +
            "  .method public hidebysig specialname rtspecialname \n" +
            "          instance void  .ctor(!T p,\n" +
            "                               int32 count) cil managed\n" +
            "  {\n" +
            "    // Code size       34 (0x22)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  ldarg.0\n" +
            "    IL_0001:  call       instance void AnyRef::.ctor()\n" +
            "    IL_0006:  nop\n" +
            "    IL_0007:  nop\n" +
            "    IL_0008:  ldarg.0\n" +
            "    IL_0009:  ldarg.2\n" +
            "    IL_000a:  newobj     instance void class [mscorlib]System.Collections.Generic.List`1<!T>::.ctor(int32)\n" +
            "    IL_000f:  stfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list\n" +
            "    IL_0014:  ldarg.0\n" +
            "    IL_0015:  ldfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list\n" +
            "    IL_001a:  ldarg.1\n" +
            "    IL_001b:  callvirt   instance void class [mscorlib]System.Collections.Generic.List`1<!T>::Add(!0)\n" +
            "    IL_0020:  nop\n" +
            "    IL_0021:  ret\n" +
            "  } // end of method RefList`1::.ctor\n" +
            "\n" +
            "  .method public hidebysig specialname rtspecialname \n" +
            "          instance void  .ctor(class [mscorlib]System.Collections.Generic.List`1<!T> l) cil managed\n" +
            "  {\n" +
            "    // Code size       16 (0x10)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  ldarg.0\n" +
            "    IL_0001:  call       instance void AnyRef::.ctor()\n" +
            "    IL_0006:  nop\n" +
            "    IL_0007:  nop\n" +
            "    IL_0008:  ldarg.0\n" +
            "    IL_0009:  ldarg.1\n" +
            "    IL_000a:  stfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list\n" +
            "    IL_000f:  ret\n" +
            "  } // end of method RefList`1::.ctor\n" +
            "\n" +
            "  .method public hidebysig instance class RefList`1<!T> \n" +
            "          append(!T v) cil managed\n" +
            "  {\n" +
            "    // Code size       20 (0x14)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class RefList`1<!T> V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list\n" +
            "    IL_0007:  ldarg.1\n" +
            "    IL_0008:  callvirt   instance void class [mscorlib]System.Collections.Generic.List`1<!T>::Add(!0)\n" +
            "    IL_000d:  nop\n" +
            "    IL_000e:  ldarg.0\n" +
            "    IL_000f:  stloc.0\n" +
            "    IL_0010:  br.s       IL_0012\n" +
            "\n" +
            "    IL_0012:  ldloc.0\n" +
            "    IL_0013:  ret\n" +
            "  } // end of method RefList`1::append\n" +
            "\n" +
            "  .method public hidebysig instance !T  head() cil managed\n" +
            "  {\n" +
            "    // Code size       18 (0x12)\n" +
            "    .maxstack  2\n" +
            "    .locals init (!T V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  callvirt   instance !0 class [mscorlib]System.Collections.Generic.List`1<!T>::get_Item(int32)\n" +
            "    IL_000d:  stloc.0\n" +
            "    IL_000e:  br.s       IL_0010\n" +
            "\n" +
            "    IL_0010:  ldloc.0\n" +
            "    IL_0011:  ret\n" +
            "  } // end of method RefList`1::head\n" +
            "\n" +
            "  .method public hidebysig instance class RefList`1<!T> \n" +
            "          tail() cil managed\n" +
            "  {\n" +
            "    // Code size       36 (0x24)\n" +
            "    .maxstack  4\n" +
            "    .locals init (class RefList`1<!T> V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list\n" +
            "    IL_0007:  ldc.i4.1\n" +
            "    IL_0008:  ldarg.0\n" +
            "    IL_0009:  ldfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list\n" +
            "    IL_000e:  callvirt   instance int32 class [mscorlib]System.Collections.Generic.List`1<!T>::get_Count()\n" +
            "    IL_0013:  ldc.i4.1\n" +
            "    IL_0014:  sub\n" +
            "    IL_0015:  callvirt   instance class [mscorlib]System.Collections.Generic.List`1<!0> class [mscorlib]System.Collections.Generic.List`1<!T>::GetRange(int32,\n" +
            "                                                                                                                                                        int32)\n" +
            "    IL_001a:  newobj     instance void class RefList`1<!T>::.ctor(class [mscorlib]System.Collections.Generic.List`1<!0>)\n" +
            "    IL_001f:  stloc.0\n" +
            "    IL_0020:  br.s       IL_0022\n" +
            "\n" +
            "    IL_0022:  ldloc.0\n" +
            "    IL_0023:  ret\n" +
            "  } // end of method RefList`1::tail\n" +
            "\n" +
            "} // end of class RefList`1\n" +
            "\n" +
            ".class public auto ansi beforefieldinit Integer\n" +
            "       extends AnyValue\n" +
            "{\n" +
            "  .field public static literal int32 Min = int32(0x00000064)\n" +
            "  .field public static literal int32 Max = int32(0x00000000)\n" +
            "  .method public hidebysig specialname rtspecialname \n" +
            "          instance void  .ctor(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       21 (0x15)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  ldarg.0\n" +
            "    IL_0001:  call       instance void AnyValue::.ctor()\n" +
            "    IL_0006:  nop\n" +
            "    IL_0007:  nop\n" +
            "    IL_0008:  ldarg.0\n" +
            "    IL_0009:  ldarg.1\n" +
            "    IL_000a:  call       uint8[] [mscorlib]System.BitConverter::GetBytes(int32)\n" +
            "    IL_000f:  stfld      uint8[] AnyValue::_value\n" +
            "    IL_0014:  ret\n" +
            "  } // end of method Integer::.ctor\n" +
            "\n" +
            "  .method public hidebysig specialname rtspecialname \n" +
            "          instance void  .ctor(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       22 (0x16)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  ldarg.0\n" +
            "    IL_0001:  call       instance void AnyValue::.ctor()\n" +
            "    IL_0006:  nop\n" +
            "    IL_0007:  nop\n" +
            "    IL_0008:  ldarg.0\n" +
            "    IL_0009:  ldarg.1\n" +
            "    IL_000a:  conv.i4\n" +
            "    IL_000b:  call       uint8[] [mscorlib]System.BitConverter::GetBytes(int32)\n" +
            "    IL_0010:  stfld      uint8[] AnyValue::_value\n" +
            "    IL_0015:  ret\n" +
            "  } // end of method Integer::.ctor\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          toReal() cil managed\n" +
            "  {\n" +
            "    // Code size       23 (0x17)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  newobj     instance void Real::.ctor(int32)\n" +
            "    IL_0012:  stloc.0\n" +
            "    IL_0013:  br.s       IL_0015\n" +
            "\n" +
            "    IL_0015:  ldloc.0\n" +
            "    IL_0016:  ret\n" +
            "  } // end of method Integer::toReal\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          toBoolean() cil managed\n" +
            "  {\n" +
            "    // Code size       29 (0x1d)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  brfalse.s  IL_0012\n" +
            "\n" +
            "    IL_000f:  ldc.i4.1\n" +
            "    IL_0010:  br.s       IL_0013\n" +
            "\n" +
            "    IL_0012:  ldc.i4.0\n" +
            "    IL_0013:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0018:  stloc.0\n" +
            "    IL_0019:  br.s       IL_001b\n" +
            "\n" +
            "    IL_001b:  ldloc.0\n" +
            "    IL_001c:  ret\n" +
            "  } // end of method Integer::toBoolean\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          UnaryMinus() cil managed\n" +
            "  {\n" +
            "    // Code size       25 (0x19)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  ldc.i4.1\n" +
            "    IL_000e:  sub\n" +
            "    IL_000f:  newobj     instance void Real::.ctor(int32)\n" +
            "    IL_0014:  stloc.0\n" +
            "    IL_0015:  br.s       IL_0017\n" +
            "\n" +
            "    IL_0017:  ldloc.0\n" +
            "    IL_0018:  ret\n" +
            "  } // end of method Integer::UnaryMinus\n" +
            "\n" +
            "  .method public hidebysig instance class Integer \n" +
            "          Plus(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       25 (0x19)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Integer V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  add\n" +
            "    IL_000f:  newobj     instance void Integer::.ctor(int32)\n" +
            "    IL_0014:  stloc.0\n" +
            "    IL_0015:  br.s       IL_0017\n" +
            "\n" +
            "    IL_0017:  ldloc.0\n" +
            "    IL_0018:  ret\n" +
            "  } // end of method Integer::Plus\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          Plus(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  conv.r8\n" +
            "    IL_000e:  ldarg.1\n" +
            "    IL_000f:  add\n" +
            "    IL_0010:  newobj     instance void Real::.ctor(float64)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Integer::Plus\n" +
            "\n" +
            "  .method public hidebysig instance class Integer \n" +
            "          Minus(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       25 (0x19)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Integer V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  sub\n" +
            "    IL_000f:  newobj     instance void Integer::.ctor(int32)\n" +
            "    IL_0014:  stloc.0\n" +
            "    IL_0015:  br.s       IL_0017\n" +
            "\n" +
            "    IL_0017:  ldloc.0\n" +
            "    IL_0018:  ret\n" +
            "  } // end of method Integer::Minus\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          Minus(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  conv.r8\n" +
            "    IL_000e:  ldarg.1\n" +
            "    IL_000f:  sub\n" +
            "    IL_0010:  newobj     instance void Real::.ctor(float64)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Integer::Minus\n" +
            "\n" +
            "  .method public hidebysig instance class Integer \n" +
            "          Mult(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       25 (0x19)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Integer V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  mul\n" +
            "    IL_000f:  newobj     instance void Integer::.ctor(int32)\n" +
            "    IL_0014:  stloc.0\n" +
            "    IL_0015:  br.s       IL_0017\n" +
            "\n" +
            "    IL_0017:  ldloc.0\n" +
            "    IL_0018:  ret\n" +
            "  } // end of method Integer::Mult\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          Mult(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  conv.r8\n" +
            "    IL_000e:  ldarg.1\n" +
            "    IL_000f:  mul\n" +
            "    IL_0010:  newobj     instance void Real::.ctor(float64)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Integer::Mult\n" +
            "\n" +
            "  .method public hidebysig instance class Integer \n" +
            "          Div(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       25 (0x19)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Integer V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  div\n" +
            "    IL_000f:  newobj     instance void Integer::.ctor(int32)\n" +
            "    IL_0014:  stloc.0\n" +
            "    IL_0015:  br.s       IL_0017\n" +
            "\n" +
            "    IL_0017:  ldloc.0\n" +
            "    IL_0018:  ret\n" +
            "  } // end of method Integer::Div\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          Div(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  conv.r8\n" +
            "    IL_000e:  ldarg.1\n" +
            "    IL_000f:  div\n" +
            "    IL_0010:  newobj     instance void Real::.ctor(float64)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Integer::Div\n" +
            "\n" +
            "  .method public hidebysig instance class Integer \n" +
            "          Rem(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       12 (0xc)\n" +
            "    .maxstack  1\n" +
            "    .locals init (class Integer V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldc.i4.0\n" +
            "    IL_0002:  newobj     instance void Integer::.ctor(int32)\n" +
            "    IL_0007:  stloc.0\n" +
            "    IL_0008:  br.s       IL_000a\n" +
            "\n" +
            "    IL_000a:  ldloc.0\n" +
            "    IL_000b:  ret\n" +
            "  } // end of method Integer::Rem\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Less(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  clt\n" +
            "    IL_0010:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Integer::Less\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Less(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       27 (0x1b)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  conv.r8\n" +
            "    IL_000e:  ldarg.1\n" +
            "    IL_000f:  clt\n" +
            "    IL_0011:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0016:  stloc.0\n" +
            "    IL_0017:  br.s       IL_0019\n" +
            "\n" +
            "    IL_0019:  ldloc.0\n" +
            "    IL_001a:  ret\n" +
            "  } // end of method Integer::Less\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          LessEqual(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       29 (0x1d)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  cgt\n" +
            "    IL_0010:  ldc.i4.0\n" +
            "    IL_0011:  ceq\n" +
            "    IL_0013:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0018:  stloc.0\n" +
            "    IL_0019:  br.s       IL_001b\n" +
            "\n" +
            "    IL_001b:  ldloc.0\n" +
            "    IL_001c:  ret\n" +
            "  } // end of method Integer::LessEqual\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          LessEqual(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       30 (0x1e)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  conv.r8\n" +
            "    IL_000e:  ldarg.1\n" +
            "    IL_000f:  cgt.un\n" +
            "    IL_0011:  ldc.i4.0\n" +
            "    IL_0012:  ceq\n" +
            "    IL_0014:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0019:  stloc.0\n" +
            "    IL_001a:  br.s       IL_001c\n" +
            "\n" +
            "    IL_001c:  ldloc.0\n" +
            "    IL_001d:  ret\n" +
            "  } // end of method Integer::LessEqual\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Greater(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  cgt\n" +
            "    IL_0010:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Integer::Greater\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Greater(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       27 (0x1b)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  conv.r8\n" +
            "    IL_000e:  ldarg.1\n" +
            "    IL_000f:  cgt\n" +
            "    IL_0011:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0016:  stloc.0\n" +
            "    IL_0017:  br.s       IL_0019\n" +
            "\n" +
            "    IL_0019:  ldloc.0\n" +
            "    IL_001a:  ret\n" +
            "  } // end of method Integer::Greater\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          GreaterEqual(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       29 (0x1d)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  clt\n" +
            "    IL_0010:  ldc.i4.0\n" +
            "    IL_0011:  ceq\n" +
            "    IL_0013:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0018:  stloc.0\n" +
            "    IL_0019:  br.s       IL_001b\n" +
            "\n" +
            "    IL_001b:  ldloc.0\n" +
            "    IL_001c:  ret\n" +
            "  } // end of method Integer::GreaterEqual\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          GreaterEqual(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       30 (0x1e)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  conv.r8\n" +
            "    IL_000e:  ldarg.1\n" +
            "    IL_000f:  clt.un\n" +
            "    IL_0011:  ldc.i4.0\n" +
            "    IL_0012:  ceq\n" +
            "    IL_0014:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0019:  stloc.0\n" +
            "    IL_001a:  br.s       IL_001c\n" +
            "\n" +
            "    IL_001c:  ldloc.0\n" +
            "    IL_001d:  ret\n" +
            "  } // end of method Integer::GreaterEqual\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Equal(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  ceq\n" +
            "    IL_0010:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Integer::Equal\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Equal(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       27 (0x1b)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],\n" +
            "                                                                      int32)\n" +
            "    IL_000d:  conv.r8\n" +
            "    IL_000e:  ldarg.1\n" +
            "    IL_000f:  ceq\n" +
            "    IL_0011:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0016:  stloc.0\n" +
            "    IL_0017:  br.s       IL_0019\n" +
            "\n" +
            "    IL_0019:  ldloc.0\n" +
            "    IL_001a:  ret\n" +
            "  } // end of method Integer::Equal\n" +
            "\n" +
            "} // end of class Integer\n" +
            "\n" +
            ".class public auto ansi beforefieldinit Real\n" +
            "       extends AnyValue\n" +
            "{\n" +
            "  .field public static literal int32 Min = int32(0x00000064)\n" +
            "  .field public static literal int32 Max = int32(0x00000000)\n" +
            "  .method public hidebysig specialname rtspecialname \n" +
            "          instance void  .ctor(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       22 (0x16)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  ldarg.0\n" +
            "    IL_0001:  call       instance void AnyValue::.ctor()\n" +
            "    IL_0006:  nop\n" +
            "    IL_0007:  nop\n" +
            "    IL_0008:  ldarg.0\n" +
            "    IL_0009:  ldarg.1\n" +
            "    IL_000a:  conv.r8\n" +
            "    IL_000b:  call       uint8[] [mscorlib]System.BitConverter::GetBytes(float64)\n" +
            "    IL_0010:  stfld      uint8[] AnyValue::_value\n" +
            "    IL_0015:  ret\n" +
            "  } // end of method Real::.ctor\n" +
            "\n" +
            "  .method public hidebysig specialname rtspecialname \n" +
            "          instance void  .ctor(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       21 (0x15)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  ldarg.0\n" +
            "    IL_0001:  call       instance void AnyValue::.ctor()\n" +
            "    IL_0006:  nop\n" +
            "    IL_0007:  nop\n" +
            "    IL_0008:  ldarg.0\n" +
            "    IL_0009:  ldarg.1\n" +
            "    IL_000a:  call       uint8[] [mscorlib]System.BitConverter::GetBytes(float64)\n" +
            "    IL_000f:  stfld      uint8[] AnyValue::_value\n" +
            "    IL_0014:  ret\n" +
            "  } // end of method Real::.ctor\n" +
            "\n" +
            "  .method public hidebysig instance class Integer \n" +
            "          toInteger() cil managed\n" +
            "  {\n" +
            "    // Code size       23 (0x17)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Integer V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  newobj     instance void Integer::.ctor(float64)\n" +
            "    IL_0012:  stloc.0\n" +
            "    IL_0013:  br.s       IL_0015\n" +
            "\n" +
            "    IL_0015:  ldloc.0\n" +
            "    IL_0016:  ret\n" +
            "  } // end of method Real::toInteger\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          UnaryMinus() cil managed\n" +
            "  {\n" +
            "    // Code size       33 (0x21)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldc.r8     1.\n" +
            "    IL_0016:  sub\n" +
            "    IL_0017:  newobj     instance void Real::.ctor(float64)\n" +
            "    IL_001c:  stloc.0\n" +
            "    IL_001d:  br.s       IL_001f\n" +
            "\n" +
            "    IL_001f:  ldloc.0\n" +
            "    IL_0020:  ret\n" +
            "  } // end of method Real::UnaryMinus\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          Plus(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  conv.r8\n" +
            "    IL_000f:  add\n" +
            "    IL_0010:  newobj     instance void Real::.ctor(float64)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Real::Plus\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          Plus(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       25 (0x19)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  add\n" +
            "    IL_000f:  newobj     instance void Real::.ctor(float64)\n" +
            "    IL_0014:  stloc.0\n" +
            "    IL_0015:  br.s       IL_0017\n" +
            "\n" +
            "    IL_0017:  ldloc.0\n" +
            "    IL_0018:  ret\n" +
            "  } // end of method Real::Plus\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          Minus(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  conv.r8\n" +
            "    IL_000f:  sub\n" +
            "    IL_0010:  newobj     instance void Real::.ctor(float64)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Real::Minus\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          Minus(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       25 (0x19)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  sub\n" +
            "    IL_000f:  newobj     instance void Real::.ctor(float64)\n" +
            "    IL_0014:  stloc.0\n" +
            "    IL_0015:  br.s       IL_0017\n" +
            "\n" +
            "    IL_0017:  ldloc.0\n" +
            "    IL_0018:  ret\n" +
            "  } // end of method Real::Minus\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          Mult(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  conv.r8\n" +
            "    IL_000f:  mul\n" +
            "    IL_0010:  newobj     instance void Real::.ctor(float64)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Real::Mult\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          Mult(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       25 (0x19)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  mul\n" +
            "    IL_000f:  newobj     instance void Real::.ctor(float64)\n" +
            "    IL_0014:  stloc.0\n" +
            "    IL_0015:  br.s       IL_0017\n" +
            "\n" +
            "    IL_0017:  ldloc.0\n" +
            "    IL_0018:  ret\n" +
            "  } // end of method Real::Mult\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          Div(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  conv.r8\n" +
            "    IL_000f:  div\n" +
            "    IL_0010:  newobj     instance void Real::.ctor(float64)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Real::Div\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          Div(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       25 (0x19)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  div\n" +
            "    IL_000f:  newobj     instance void Real::.ctor(float64)\n" +
            "    IL_0014:  stloc.0\n" +
            "    IL_0015:  br.s       IL_0017\n" +
            "\n" +
            "    IL_0017:  ldloc.0\n" +
            "    IL_0018:  ret\n" +
            "  } // end of method Real::Div\n" +
            "\n" +
            "  .method public hidebysig instance class Real \n" +
            "          Rem(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       20 (0x14)\n" +
            "    .maxstack  1\n" +
            "    .locals init (class Real V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldc.r8     0.0\n" +
            "    IL_000a:  newobj     instance void Real::.ctor(float64)\n" +
            "    IL_000f:  stloc.0\n" +
            "    IL_0010:  br.s       IL_0012\n" +
            "\n" +
            "    IL_0012:  ldloc.0\n" +
            "    IL_0013:  ret\n" +
            "  } // end of method Real::Rem\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Less(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       27 (0x1b)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  conv.r8\n" +
            "    IL_000f:  clt\n" +
            "    IL_0011:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0016:  stloc.0\n" +
            "    IL_0017:  br.s       IL_0019\n" +
            "\n" +
            "    IL_0019:  ldloc.0\n" +
            "    IL_001a:  ret\n" +
            "  } // end of method Real::Less\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Less(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  clt\n" +
            "    IL_0010:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Real::Less\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          LessEqual(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       30 (0x1e)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  conv.r8\n" +
            "    IL_000f:  cgt.un\n" +
            "    IL_0011:  ldc.i4.0\n" +
            "    IL_0012:  ceq\n" +
            "    IL_0014:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0019:  stloc.0\n" +
            "    IL_001a:  br.s       IL_001c\n" +
            "\n" +
            "    IL_001c:  ldloc.0\n" +
            "    IL_001d:  ret\n" +
            "  } // end of method Real::LessEqual\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          LessEqual(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       29 (0x1d)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  cgt.un\n" +
            "    IL_0010:  ldc.i4.0\n" +
            "    IL_0011:  ceq\n" +
            "    IL_0013:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0018:  stloc.0\n" +
            "    IL_0019:  br.s       IL_001b\n" +
            "\n" +
            "    IL_001b:  ldloc.0\n" +
            "    IL_001c:  ret\n" +
            "  } // end of method Real::LessEqual\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Greater(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       27 (0x1b)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  conv.r8\n" +
            "    IL_000f:  cgt\n" +
            "    IL_0011:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0016:  stloc.0\n" +
            "    IL_0017:  br.s       IL_0019\n" +
            "\n" +
            "    IL_0019:  ldloc.0\n" +
            "    IL_001a:  ret\n" +
            "  } // end of method Real::Greater\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Greater(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  cgt\n" +
            "    IL_0010:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Real::Greater\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          GreaterEqual(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       30 (0x1e)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  conv.r8\n" +
            "    IL_000f:  clt.un\n" +
            "    IL_0011:  ldc.i4.0\n" +
            "    IL_0012:  ceq\n" +
            "    IL_0014:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0019:  stloc.0\n" +
            "    IL_001a:  br.s       IL_001c\n" +
            "\n" +
            "    IL_001c:  ldloc.0\n" +
            "    IL_001d:  ret\n" +
            "  } // end of method Real::GreaterEqual\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          GreaterEqual(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       29 (0x1d)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  clt.un\n" +
            "    IL_0010:  ldc.i4.0\n" +
            "    IL_0011:  ceq\n" +
            "    IL_0013:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0018:  stloc.0\n" +
            "    IL_0019:  br.s       IL_001b\n" +
            "\n" +
            "    IL_001b:  ldloc.0\n" +
            "    IL_001c:  ret\n" +
            "  } // end of method Real::GreaterEqual\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Equal(int32 v) cil managed\n" +
            "  {\n" +
            "    // Code size       27 (0x1b)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  conv.r8\n" +
            "    IL_000f:  ceq\n" +
            "    IL_0011:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0016:  stloc.0\n" +
            "    IL_0017:  br.s       IL_0019\n" +
            "\n" +
            "    IL_0019:  ldloc.0\n" +
            "    IL_001a:  ret\n" +
            "  } // end of method Real::Equal\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Equal(float64 v) cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],\n" +
            "                                                                         int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  ceq\n" +
            "    IL_0010:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Real::Equal\n" +
            "\n" +
            "} // end of class Real\n" +
            "\n" +
            ".class public auto ansi beforefieldinit Boolean\n" +
            "       extends AnyValue\n" +
            "{\n" +
            "  .method public hidebysig specialname rtspecialname \n" +
            "          instance void  .ctor(bool v) cil managed\n" +
            "  {\n" +
            "    // Code size       21 (0x15)\n" +
            "    .maxstack  8\n" +
            "    IL_0000:  ldarg.0\n" +
            "    IL_0001:  call       instance void AnyValue::.ctor()\n" +
            "    IL_0006:  nop\n" +
            "    IL_0007:  nop\n" +
            "    IL_0008:  ldarg.0\n" +
            "    IL_0009:  ldarg.1\n" +
            "    IL_000a:  call       uint8[] [mscorlib]System.BitConverter::GetBytes(bool)\n" +
            "    IL_000f:  stfld      uint8[] AnyValue::_value\n" +
            "    IL_0014:  ret\n" +
            "  } // end of method Boolean::.ctor\n" +
            "\n" +
            "  .method public hidebysig instance class Integer \n" +
            "          toInteger() cil managed\n" +
            "  {\n" +
            "    // Code size       29 (0x1d)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Integer V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       bool [mscorlib]System.BitConverter::ToBoolean(uint8[],\n" +
            "                                                                       int32)\n" +
            "    IL_000d:  brtrue.s   IL_0012\n" +
            "\n" +
            "    IL_000f:  ldc.i4.0\n" +
            "    IL_0010:  br.s       IL_0013\n" +
            "\n" +
            "    IL_0012:  ldc.i4.1\n" +
            "    IL_0013:  newobj     instance void Integer::.ctor(int32)\n" +
            "    IL_0018:  stloc.0\n" +
            "    IL_0019:  br.s       IL_001b\n" +
            "\n" +
            "    IL_001b:  ldloc.0\n" +
            "    IL_001c:  ret\n" +
            "  } // end of method Boolean::toInteger\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Or(bool v) cil managed\n" +
            "  {\n" +
            "    // Code size       25 (0x19)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       bool [mscorlib]System.BitConverter::ToBoolean(uint8[],\n" +
            "                                                                       int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  or\n" +
            "    IL_000f:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0014:  stloc.0\n" +
            "    IL_0015:  br.s       IL_0017\n" +
            "\n" +
            "    IL_0017:  ldloc.0\n" +
            "    IL_0018:  ret\n" +
            "  } // end of method Boolean::Or\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          And(bool v) cil managed\n" +
            "  {\n" +
            "    // Code size       25 (0x19)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       bool [mscorlib]System.BitConverter::ToBoolean(uint8[],\n" +
            "                                                                       int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  and\n" +
            "    IL_000f:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0014:  stloc.0\n" +
            "    IL_0015:  br.s       IL_0017\n" +
            "\n" +
            "    IL_0017:  ldloc.0\n" +
            "    IL_0018:  ret\n" +
            "  } // end of method Boolean::And\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Xor(bool v) cil managed\n" +
            "  {\n" +
            "    // Code size       25 (0x19)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       bool [mscorlib]System.BitConverter::ToBoolean(uint8[],\n" +
            "                                                                       int32)\n" +
            "    IL_000d:  ldarg.1\n" +
            "    IL_000e:  xor\n" +
            "    IL_000f:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0014:  stloc.0\n" +
            "    IL_0015:  br.s       IL_0017\n" +
            "\n" +
            "    IL_0017:  ldloc.0\n" +
            "    IL_0018:  ret\n" +
            "  } // end of method Boolean::Xor\n" +
            "\n" +
            "  .method public hidebysig instance class Boolean \n" +
            "          Not() cil managed\n" +
            "  {\n" +
            "    // Code size       26 (0x1a)\n" +
            "    .maxstack  2\n" +
            "    .locals init (class Boolean V_0)\n" +
            "    IL_0000:  nop\n" +
            "    IL_0001:  ldarg.0\n" +
            "    IL_0002:  ldfld      uint8[] AnyValue::_value\n" +
            "    IL_0007:  ldc.i4.0\n" +
            "    IL_0008:  call       bool [mscorlib]System.BitConverter::ToBoolean(uint8[],\n" +
            "                                                                       int32)\n" +
            "    IL_000d:  ldc.i4.0\n" +
            "    IL_000e:  ceq\n" +
            "    IL_0010:  newobj     instance void Boolean::.ctor(bool)\n" +
            "    IL_0015:  stloc.0\n" +
            "    IL_0016:  br.s       IL_0018\n" +
            "\n" +
            "    IL_0018:  ldloc.0\n" +
            "    IL_0019:  ret\n" +
            "  } // end of method Boolean::Not\n" +
            "\n" +
            "} // end of class Boolean\n\n";
}
