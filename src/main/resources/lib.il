.assembly extern mscorlib
{
  .publickeytoken = (B7 7A 5C 56 19 34 E0 89 )                         // .z\V.4..
  .ver 4:0:0:0
}

.class public auto ansi beforefieldinit Class
       extends [mscorlib]System.Object
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [mscorlib]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Class::.ctor

} // end of class Class

.class public auto ansi beforefieldinit AnyValue
       extends Class
{
  .field public uint8[] _value
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void Class::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method AnyValue::.ctor

} // end of class AnyValue

.class public auto ansi beforefieldinit AnyRef
       extends Class
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void Class::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method AnyRef::.ctor

} // end of class AnyRef

.class public auto ansi beforefieldinit Printer
       extends [mscorlib]System.Object
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       9 (0x9)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [mscorlib]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ret
  } // end of method Printer::.ctor

  .method public hidebysig instance void 
          Print(class Integer v) cil managed
  {
    // Code size       20 (0x14)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  call       void [mscorlib]System.Console::WriteLine(int32)
    IL_0012:  nop
    IL_0013:  ret
  } // end of method Printer::Print

  .method public hidebysig instance void 
          Print(class Real v) cil managed
  {
    // Code size       20 (0x14)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.1
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  call       void [mscorlib]System.Console::WriteLine(float64)
    IL_0012:  nop
    IL_0013:  ret
  } // end of method Printer::Print

} // end of class Printer

.class public auto ansi beforefieldinit RefArray`1<T>
       extends AnyRef
{
  .field family !T[] 'array'
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(int32 l) cil managed
  {
    // Code size       21 (0x15)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void AnyRef::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  newarr     !T
    IL_000f:  stfld      !0[] class RefArray`1<!T>::'array'
    IL_0014:  ret
  } // end of method RefArray`1::.ctor

  .method public hidebysig instance class RefList`1<!T> 
          toList() cil managed
  {
    // Code size       17 (0x11)
    .maxstack  1
    .locals init (class RefList`1<!T> V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      !0[] class RefArray`1<!T>::'array'
    IL_0007:  newobj     instance void class RefList`1<!T>::.ctor(!0[])
    IL_000c:  stloc.0
    IL_000d:  br.s       IL_000f

    IL_000f:  ldloc.0
    IL_0010:  ret
  } // end of method RefArray`1::toList

  .method public hidebysig instance int32 
          Length() cil managed
  {
    // Code size       14 (0xe)
    .maxstack  1
    .locals init (int32 V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      !0[] class RefArray`1<!T>::'array'
    IL_0007:  ldlen
    IL_0008:  conv.i4
    IL_0009:  stloc.0
    IL_000a:  br.s       IL_000c

    IL_000c:  ldloc.0
    IL_000d:  ret
  } // end of method RefArray`1::Length

  .method public hidebysig instance !T  get(int32 i) cil managed
  {
    // Code size       18 (0x12)
    .maxstack  2
    .locals init (!T V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      !0[] class RefArray`1<!T>::'array'
    IL_0007:  ldarg.1
    IL_0008:  ldelem     !T
    IL_000d:  stloc.0
    IL_000e:  br.s       IL_0010

    IL_0010:  ldloc.0
    IL_0011:  ret
  } // end of method RefArray`1::get

  .method public hidebysig instance void 
          set(int32 i,
              !T v) cil managed
  {
    // Code size       15 (0xf)
    .maxstack  8
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      !0[] class RefArray`1<!T>::'array'
    IL_0007:  ldarg.1
    IL_0008:  ldarg.2
    IL_0009:  stelem     !T
    IL_000e:  ret
  } // end of method RefArray`1::set

} // end of class RefArray`1

.class public auto ansi beforefieldinit RefList`1<T>
       extends AnyRef
{
  .field family class [mscorlib]System.Collections.Generic.List`1<!T> list
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       20 (0x14)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void AnyRef::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  newobj     instance void class [mscorlib]System.Collections.Generic.List`1<!T>::.ctor()
    IL_000e:  stfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list
    IL_0013:  ret
  } // end of method RefList`1::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(!T[] arr) cil managed
  {
    // Code size       21 (0x15)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void AnyRef::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  newobj     instance void class [mscorlib]System.Collections.Generic.List`1<!T>::.ctor(class [mscorlib]System.Collections.Generic.IEnumerable`1<!0>)
    IL_000f:  stfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list
    IL_0014:  ret
  } // end of method RefList`1::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(!T p,
                               int32 count) cil managed
  {
    // Code size       34 (0x22)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void AnyRef::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.2
    IL_000a:  newobj     instance void class [mscorlib]System.Collections.Generic.List`1<!T>::.ctor(int32)
    IL_000f:  stfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list
    IL_0014:  ldarg.0
    IL_0015:  ldfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list
    IL_001a:  ldarg.1
    IL_001b:  callvirt   instance void class [mscorlib]System.Collections.Generic.List`1<!T>::Add(!0)
    IL_0020:  nop
    IL_0021:  ret
  } // end of method RefList`1::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(class [mscorlib]System.Collections.Generic.List`1<!T> l) cil managed
  {
    // Code size       16 (0x10)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void AnyRef::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  stfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list
    IL_000f:  ret
  } // end of method RefList`1::.ctor

  .method public hidebysig instance class RefList`1<!T> 
          append(!T v) cil managed
  {
    // Code size       20 (0x14)
    .maxstack  2
    .locals init (class RefList`1<!T> V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list
    IL_0007:  ldarg.1
    IL_0008:  callvirt   instance void class [mscorlib]System.Collections.Generic.List`1<!T>::Add(!0)
    IL_000d:  nop
    IL_000e:  ldarg.0
    IL_000f:  stloc.0
    IL_0010:  br.s       IL_0012

    IL_0012:  ldloc.0
    IL_0013:  ret
  } // end of method RefList`1::append

  .method public hidebysig instance !T  head() cil managed
  {
    // Code size       18 (0x12)
    .maxstack  2
    .locals init (!T V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list
    IL_0007:  ldc.i4.0
    IL_0008:  callvirt   instance !0 class [mscorlib]System.Collections.Generic.List`1<!T>::get_Item(int32)
    IL_000d:  stloc.0
    IL_000e:  br.s       IL_0010

    IL_0010:  ldloc.0
    IL_0011:  ret
  } // end of method RefList`1::head

  .method public hidebysig instance class RefList`1<!T> 
          tail() cil managed
  {
    // Code size       36 (0x24)
    .maxstack  4
    .locals init (class RefList`1<!T> V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list
    IL_0007:  ldc.i4.1
    IL_0008:  ldarg.0
    IL_0009:  ldfld      class [mscorlib]System.Collections.Generic.List`1<!0> class RefList`1<!T>::list
    IL_000e:  callvirt   instance int32 class [mscorlib]System.Collections.Generic.List`1<!T>::get_Count()
    IL_0013:  ldc.i4.1
    IL_0014:  sub
    IL_0015:  callvirt   instance class [mscorlib]System.Collections.Generic.List`1<!0> class [mscorlib]System.Collections.Generic.List`1<!T>::GetRange(int32,
                                                                                                                                                        int32)
    IL_001a:  newobj     instance void class RefList`1<!T>::.ctor(class [mscorlib]System.Collections.Generic.List`1<!0>)
    IL_001f:  stloc.0
    IL_0020:  br.s       IL_0022

    IL_0022:  ldloc.0
    IL_0023:  ret
  } // end of method RefList`1::tail

} // end of class RefList`1

.class public auto ansi beforefieldinit Integer
       extends AnyValue
{
  .field public static literal int32 Min = int32(0x00000064)
  .field public static literal int32 Max = int32(0x00000000)
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(int32 v) cil managed
  {
    // Code size       21 (0x15)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void AnyValue::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  call       uint8[] [mscorlib]System.BitConverter::GetBytes(int32)
    IL_000f:  stfld      uint8[] AnyValue::_value
    IL_0014:  ret
  } // end of method Integer::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(float64 v) cil managed
  {
    // Code size       22 (0x16)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void AnyValue::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  conv.i4
    IL_000b:  call       uint8[] [mscorlib]System.BitConverter::GetBytes(int32)
    IL_0010:  stfld      uint8[] AnyValue::_value
    IL_0015:  ret
  } // end of method Integer::.ctor

  .method public hidebysig instance class Real 
          toReal() cil managed
  {
    // Code size       23 (0x17)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  newobj     instance void Real::.ctor(int32)
    IL_0012:  stloc.0
    IL_0013:  br.s       IL_0015

    IL_0015:  ldloc.0
    IL_0016:  ret
  } // end of method Integer::toReal

  .method public hidebysig instance class Boolean 
          toBoolean() cil managed
  {
    // Code size       29 (0x1d)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  brfalse.s  IL_0012

    IL_000f:  ldc.i4.1
    IL_0010:  br.s       IL_0013

    IL_0012:  ldc.i4.0
    IL_0013:  newobj     instance void Boolean::.ctor(bool)
    IL_0018:  stloc.0
    IL_0019:  br.s       IL_001b

    IL_001b:  ldloc.0
    IL_001c:  ret
  } // end of method Integer::toBoolean

  .method public hidebysig instance class Real 
          UnaryMinus() cil managed
  {
    // Code size       25 (0x19)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  ldc.i4.1
    IL_000e:  sub
    IL_000f:  newobj     instance void Real::.ctor(int32)
    IL_0014:  stloc.0
    IL_0015:  br.s       IL_0017

    IL_0017:  ldloc.0
    IL_0018:  ret
  } // end of method Integer::UnaryMinus

  .method public hidebysig instance class Integer 
          Plus(int32 v) cil managed
  {
    // Code size       25 (0x19)
    .maxstack  2
    .locals init (class Integer V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  ldarg.1
    IL_000e:  add
    IL_000f:  newobj     instance void Integer::.ctor(int32)
    IL_0014:  stloc.0
    IL_0015:  br.s       IL_0017

    IL_0017:  ldloc.0
    IL_0018:  ret
  } // end of method Integer::Plus

  .method public hidebysig instance class Real 
          Plus(float64 v) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  conv.r8
    IL_000e:  ldarg.1
    IL_000f:  add
    IL_0010:  newobj     instance void Real::.ctor(float64)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Integer::Plus

  .method public hidebysig instance class Integer 
          Minus(int32 v) cil managed
  {
    // Code size       25 (0x19)
    .maxstack  2
    .locals init (class Integer V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  ldarg.1
    IL_000e:  sub
    IL_000f:  newobj     instance void Integer::.ctor(int32)
    IL_0014:  stloc.0
    IL_0015:  br.s       IL_0017

    IL_0017:  ldloc.0
    IL_0018:  ret
  } // end of method Integer::Minus

  .method public hidebysig instance class Real 
          Minus(float64 v) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  conv.r8
    IL_000e:  ldarg.1
    IL_000f:  sub
    IL_0010:  newobj     instance void Real::.ctor(float64)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Integer::Minus

  .method public hidebysig instance class Integer 
          Mult(int32 v) cil managed
  {
    // Code size       25 (0x19)
    .maxstack  2
    .locals init (class Integer V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  ldarg.1
    IL_000e:  mul
    IL_000f:  newobj     instance void Integer::.ctor(int32)
    IL_0014:  stloc.0
    IL_0015:  br.s       IL_0017

    IL_0017:  ldloc.0
    IL_0018:  ret
  } // end of method Integer::Mult

  .method public hidebysig instance class Real 
          Mult(float64 v) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  conv.r8
    IL_000e:  ldarg.1
    IL_000f:  mul
    IL_0010:  newobj     instance void Real::.ctor(float64)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Integer::Mult

  .method public hidebysig instance class Integer 
          Div(int32 v) cil managed
  {
    // Code size       25 (0x19)
    .maxstack  2
    .locals init (class Integer V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  ldarg.1
    IL_000e:  div
    IL_000f:  newobj     instance void Integer::.ctor(int32)
    IL_0014:  stloc.0
    IL_0015:  br.s       IL_0017

    IL_0017:  ldloc.0
    IL_0018:  ret
  } // end of method Integer::Div

  .method public hidebysig instance class Real 
          Div(float64 v) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  conv.r8
    IL_000e:  ldarg.1
    IL_000f:  div
    IL_0010:  newobj     instance void Real::.ctor(float64)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Integer::Div

  .method public hidebysig instance class Integer 
          Rem(int32 v) cil managed
  {
    // Code size       12 (0xc)
    .maxstack  1
    .locals init (class Integer V_0)
    IL_0000:  nop
    IL_0001:  ldc.i4.0
    IL_0002:  newobj     instance void Integer::.ctor(int32)
    IL_0007:  stloc.0
    IL_0008:  br.s       IL_000a

    IL_000a:  ldloc.0
    IL_000b:  ret
  } // end of method Integer::Rem

  .method public hidebysig instance class Boolean 
          Less(int32 v) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  ldarg.1
    IL_000e:  clt
    IL_0010:  newobj     instance void Boolean::.ctor(bool)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Integer::Less

  .method public hidebysig instance class Boolean 
          Less(float64 v) cil managed
  {
    // Code size       27 (0x1b)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  conv.r8
    IL_000e:  ldarg.1
    IL_000f:  clt
    IL_0011:  newobj     instance void Boolean::.ctor(bool)
    IL_0016:  stloc.0
    IL_0017:  br.s       IL_0019

    IL_0019:  ldloc.0
    IL_001a:  ret
  } // end of method Integer::Less

  .method public hidebysig instance class Boolean 
          LessEqual(int32 v) cil managed
  {
    // Code size       29 (0x1d)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  ldarg.1
    IL_000e:  cgt
    IL_0010:  ldc.i4.0
    IL_0011:  ceq
    IL_0013:  newobj     instance void Boolean::.ctor(bool)
    IL_0018:  stloc.0
    IL_0019:  br.s       IL_001b

    IL_001b:  ldloc.0
    IL_001c:  ret
  } // end of method Integer::LessEqual

  .method public hidebysig instance class Boolean 
          LessEqual(float64 v) cil managed
  {
    // Code size       30 (0x1e)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  conv.r8
    IL_000e:  ldarg.1
    IL_000f:  cgt.un
    IL_0011:  ldc.i4.0
    IL_0012:  ceq
    IL_0014:  newobj     instance void Boolean::.ctor(bool)
    IL_0019:  stloc.0
    IL_001a:  br.s       IL_001c

    IL_001c:  ldloc.0
    IL_001d:  ret
  } // end of method Integer::LessEqual

  .method public hidebysig instance class Boolean 
          Greater(int32 v) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  ldarg.1
    IL_000e:  cgt
    IL_0010:  newobj     instance void Boolean::.ctor(bool)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Integer::Greater

  .method public hidebysig instance class Boolean 
          Greater(float64 v) cil managed
  {
    // Code size       27 (0x1b)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  conv.r8
    IL_000e:  ldarg.1
    IL_000f:  cgt
    IL_0011:  newobj     instance void Boolean::.ctor(bool)
    IL_0016:  stloc.0
    IL_0017:  br.s       IL_0019

    IL_0019:  ldloc.0
    IL_001a:  ret
  } // end of method Integer::Greater

  .method public hidebysig instance class Boolean 
          GreaterEqual(int32 v) cil managed
  {
    // Code size       29 (0x1d)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  ldarg.1
    IL_000e:  clt
    IL_0010:  ldc.i4.0
    IL_0011:  ceq
    IL_0013:  newobj     instance void Boolean::.ctor(bool)
    IL_0018:  stloc.0
    IL_0019:  br.s       IL_001b

    IL_001b:  ldloc.0
    IL_001c:  ret
  } // end of method Integer::GreaterEqual

  .method public hidebysig instance class Boolean 
          GreaterEqual(float64 v) cil managed
  {
    // Code size       30 (0x1e)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  conv.r8
    IL_000e:  ldarg.1
    IL_000f:  clt.un
    IL_0011:  ldc.i4.0
    IL_0012:  ceq
    IL_0014:  newobj     instance void Boolean::.ctor(bool)
    IL_0019:  stloc.0
    IL_001a:  br.s       IL_001c

    IL_001c:  ldloc.0
    IL_001d:  ret
  } // end of method Integer::GreaterEqual

  .method public hidebysig instance class Boolean 
          Equal(int32 v) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  ldarg.1
    IL_000e:  ceq
    IL_0010:  newobj     instance void Boolean::.ctor(bool)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Integer::Equal

  .method public hidebysig instance class Boolean 
          Equal(float64 v) cil managed
  {
    // Code size       27 (0x1b)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       int32 [mscorlib]System.BitConverter::ToInt32(uint8[],
                                                                      int32)
    IL_000d:  conv.r8
    IL_000e:  ldarg.1
    IL_000f:  ceq
    IL_0011:  newobj     instance void Boolean::.ctor(bool)
    IL_0016:  stloc.0
    IL_0017:  br.s       IL_0019

    IL_0019:  ldloc.0
    IL_001a:  ret
  } // end of method Integer::Equal

} // end of class Integer

.class public auto ansi beforefieldinit Real
       extends AnyValue
{
  .field public static literal int32 Min = int32(0x00000064)
  .field public static literal int32 Max = int32(0x00000000)
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(int32 v) cil managed
  {
    // Code size       22 (0x16)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void AnyValue::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  conv.r8
    IL_000b:  call       uint8[] [mscorlib]System.BitConverter::GetBytes(float64)
    IL_0010:  stfld      uint8[] AnyValue::_value
    IL_0015:  ret
  } // end of method Real::.ctor

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(float64 v) cil managed
  {
    // Code size       21 (0x15)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void AnyValue::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  call       uint8[] [mscorlib]System.BitConverter::GetBytes(float64)
    IL_000f:  stfld      uint8[] AnyValue::_value
    IL_0014:  ret
  } // end of method Real::.ctor

  .method public hidebysig instance class Integer 
          toInteger() cil managed
  {
    // Code size       23 (0x17)
    .maxstack  2
    .locals init (class Integer V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  newobj     instance void Integer::.ctor(float64)
    IL_0012:  stloc.0
    IL_0013:  br.s       IL_0015

    IL_0015:  ldloc.0
    IL_0016:  ret
  } // end of method Real::toInteger

  .method public hidebysig instance class Real 
          UnaryMinus() cil managed
  {
    // Code size       33 (0x21)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldc.r8     1.
    IL_0016:  sub
    IL_0017:  newobj     instance void Real::.ctor(float64)
    IL_001c:  stloc.0
    IL_001d:  br.s       IL_001f

    IL_001f:  ldloc.0
    IL_0020:  ret
  } // end of method Real::UnaryMinus

  .method public hidebysig instance class Real 
          Plus(int32 v) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  conv.r8
    IL_000f:  add
    IL_0010:  newobj     instance void Real::.ctor(float64)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Real::Plus

  .method public hidebysig instance class Real 
          Plus(float64 v) cil managed
  {
    // Code size       25 (0x19)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  add
    IL_000f:  newobj     instance void Real::.ctor(float64)
    IL_0014:  stloc.0
    IL_0015:  br.s       IL_0017

    IL_0017:  ldloc.0
    IL_0018:  ret
  } // end of method Real::Plus

  .method public hidebysig instance class Real 
          Minus(int32 v) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  conv.r8
    IL_000f:  sub
    IL_0010:  newobj     instance void Real::.ctor(float64)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Real::Minus

  .method public hidebysig instance class Real 
          Minus(float64 v) cil managed
  {
    // Code size       25 (0x19)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  sub
    IL_000f:  newobj     instance void Real::.ctor(float64)
    IL_0014:  stloc.0
    IL_0015:  br.s       IL_0017

    IL_0017:  ldloc.0
    IL_0018:  ret
  } // end of method Real::Minus

  .method public hidebysig instance class Real 
          Mult(int32 v) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  conv.r8
    IL_000f:  mul
    IL_0010:  newobj     instance void Real::.ctor(float64)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Real::Mult

  .method public hidebysig instance class Real 
          Mult(float64 v) cil managed
  {
    // Code size       25 (0x19)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  mul
    IL_000f:  newobj     instance void Real::.ctor(float64)
    IL_0014:  stloc.0
    IL_0015:  br.s       IL_0017

    IL_0017:  ldloc.0
    IL_0018:  ret
  } // end of method Real::Mult

  .method public hidebysig instance class Real 
          Div(int32 v) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  conv.r8
    IL_000f:  div
    IL_0010:  newobj     instance void Real::.ctor(float64)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Real::Div

  .method public hidebysig instance class Real 
          Div(float64 v) cil managed
  {
    // Code size       25 (0x19)
    .maxstack  2
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  div
    IL_000f:  newobj     instance void Real::.ctor(float64)
    IL_0014:  stloc.0
    IL_0015:  br.s       IL_0017

    IL_0017:  ldloc.0
    IL_0018:  ret
  } // end of method Real::Div

  .method public hidebysig instance class Real 
          Rem(int32 v) cil managed
  {
    // Code size       20 (0x14)
    .maxstack  1
    .locals init (class Real V_0)
    IL_0000:  nop
    IL_0001:  ldc.r8     0.0
    IL_000a:  newobj     instance void Real::.ctor(float64)
    IL_000f:  stloc.0
    IL_0010:  br.s       IL_0012

    IL_0012:  ldloc.0
    IL_0013:  ret
  } // end of method Real::Rem

  .method public hidebysig instance class Boolean 
          Less(int32 v) cil managed
  {
    // Code size       27 (0x1b)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  conv.r8
    IL_000f:  clt
    IL_0011:  newobj     instance void Boolean::.ctor(bool)
    IL_0016:  stloc.0
    IL_0017:  br.s       IL_0019

    IL_0019:  ldloc.0
    IL_001a:  ret
  } // end of method Real::Less

  .method public hidebysig instance class Boolean 
          Less(float64 v) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  clt
    IL_0010:  newobj     instance void Boolean::.ctor(bool)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Real::Less

  .method public hidebysig instance class Boolean 
          LessEqual(int32 v) cil managed
  {
    // Code size       30 (0x1e)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  conv.r8
    IL_000f:  cgt.un
    IL_0011:  ldc.i4.0
    IL_0012:  ceq
    IL_0014:  newobj     instance void Boolean::.ctor(bool)
    IL_0019:  stloc.0
    IL_001a:  br.s       IL_001c

    IL_001c:  ldloc.0
    IL_001d:  ret
  } // end of method Real::LessEqual

  .method public hidebysig instance class Boolean 
          LessEqual(float64 v) cil managed
  {
    // Code size       29 (0x1d)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  cgt.un
    IL_0010:  ldc.i4.0
    IL_0011:  ceq
    IL_0013:  newobj     instance void Boolean::.ctor(bool)
    IL_0018:  stloc.0
    IL_0019:  br.s       IL_001b

    IL_001b:  ldloc.0
    IL_001c:  ret
  } // end of method Real::LessEqual

  .method public hidebysig instance class Boolean 
          Greater(int32 v) cil managed
  {
    // Code size       27 (0x1b)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  conv.r8
    IL_000f:  cgt
    IL_0011:  newobj     instance void Boolean::.ctor(bool)
    IL_0016:  stloc.0
    IL_0017:  br.s       IL_0019

    IL_0019:  ldloc.0
    IL_001a:  ret
  } // end of method Real::Greater

  .method public hidebysig instance class Boolean 
          Greater(float64 v) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  cgt
    IL_0010:  newobj     instance void Boolean::.ctor(bool)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Real::Greater

  .method public hidebysig instance class Boolean 
          GreaterEqual(int32 v) cil managed
  {
    // Code size       30 (0x1e)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  conv.r8
    IL_000f:  clt.un
    IL_0011:  ldc.i4.0
    IL_0012:  ceq
    IL_0014:  newobj     instance void Boolean::.ctor(bool)
    IL_0019:  stloc.0
    IL_001a:  br.s       IL_001c

    IL_001c:  ldloc.0
    IL_001d:  ret
  } // end of method Real::GreaterEqual

  .method public hidebysig instance class Boolean 
          GreaterEqual(float64 v) cil managed
  {
    // Code size       29 (0x1d)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  clt.un
    IL_0010:  ldc.i4.0
    IL_0011:  ceq
    IL_0013:  newobj     instance void Boolean::.ctor(bool)
    IL_0018:  stloc.0
    IL_0019:  br.s       IL_001b

    IL_001b:  ldloc.0
    IL_001c:  ret
  } // end of method Real::GreaterEqual

  .method public hidebysig instance class Boolean 
          Equal(int32 v) cil managed
  {
    // Code size       27 (0x1b)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  conv.r8
    IL_000f:  ceq
    IL_0011:  newobj     instance void Boolean::.ctor(bool)
    IL_0016:  stloc.0
    IL_0017:  br.s       IL_0019

    IL_0019:  ldloc.0
    IL_001a:  ret
  } // end of method Real::Equal

  .method public hidebysig instance class Boolean 
          Equal(float64 v) cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       float64 [mscorlib]System.BitConverter::ToDouble(uint8[],
                                                                         int32)
    IL_000d:  ldarg.1
    IL_000e:  ceq
    IL_0010:  newobj     instance void Boolean::.ctor(bool)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Real::Equal

} // end of class Real

.class public auto ansi beforefieldinit Boolean
       extends AnyValue
{
  .method public hidebysig specialname rtspecialname 
          instance void  .ctor(bool v) cil managed
  {
    // Code size       21 (0x15)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void AnyValue::.ctor()
    IL_0006:  nop
    IL_0007:  nop
    IL_0008:  ldarg.0
    IL_0009:  ldarg.1
    IL_000a:  call       uint8[] [mscorlib]System.BitConverter::GetBytes(bool)
    IL_000f:  stfld      uint8[] AnyValue::_value
    IL_0014:  ret
  } // end of method Boolean::.ctor

  .method public hidebysig instance class Integer 
          toInteger() cil managed
  {
    // Code size       29 (0x1d)
    .maxstack  2
    .locals init (class Integer V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       bool [mscorlib]System.BitConverter::ToBoolean(uint8[],
                                                                       int32)
    IL_000d:  brtrue.s   IL_0012

    IL_000f:  ldc.i4.0
    IL_0010:  br.s       IL_0013

    IL_0012:  ldc.i4.1
    IL_0013:  newobj     instance void Integer::.ctor(int32)
    IL_0018:  stloc.0
    IL_0019:  br.s       IL_001b

    IL_001b:  ldloc.0
    IL_001c:  ret
  } // end of method Boolean::toInteger

  .method public hidebysig instance class Boolean 
          Or(bool v) cil managed
  {
    // Code size       25 (0x19)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       bool [mscorlib]System.BitConverter::ToBoolean(uint8[],
                                                                       int32)
    IL_000d:  ldarg.1
    IL_000e:  or
    IL_000f:  newobj     instance void Boolean::.ctor(bool)
    IL_0014:  stloc.0
    IL_0015:  br.s       IL_0017

    IL_0017:  ldloc.0
    IL_0018:  ret
  } // end of method Boolean::Or

  .method public hidebysig instance class Boolean 
          And(bool v) cil managed
  {
    // Code size       25 (0x19)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       bool [mscorlib]System.BitConverter::ToBoolean(uint8[],
                                                                       int32)
    IL_000d:  ldarg.1
    IL_000e:  and
    IL_000f:  newobj     instance void Boolean::.ctor(bool)
    IL_0014:  stloc.0
    IL_0015:  br.s       IL_0017

    IL_0017:  ldloc.0
    IL_0018:  ret
  } // end of method Boolean::And

  .method public hidebysig instance class Boolean 
          Xor(bool v) cil managed
  {
    // Code size       25 (0x19)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       bool [mscorlib]System.BitConverter::ToBoolean(uint8[],
                                                                       int32)
    IL_000d:  ldarg.1
    IL_000e:  xor
    IL_000f:  newobj     instance void Boolean::.ctor(bool)
    IL_0014:  stloc.0
    IL_0015:  br.s       IL_0017

    IL_0017:  ldloc.0
    IL_0018:  ret
  } // end of method Boolean::Xor

  .method public hidebysig instance class Boolean 
          Not() cil managed
  {
    // Code size       26 (0x1a)
    .maxstack  2
    .locals init (class Boolean V_0)
    IL_0000:  nop
    IL_0001:  ldarg.0
    IL_0002:  ldfld      uint8[] AnyValue::_value
    IL_0007:  ldc.i4.0
    IL_0008:  call       bool [mscorlib]System.BitConverter::ToBoolean(uint8[],
                                                                       int32)
    IL_000d:  ldc.i4.0
    IL_000e:  ceq
    IL_0010:  newobj     instance void Boolean::.ctor(bool)
    IL_0015:  stloc.0
    IL_0016:  br.s       IL_0018

    IL_0018:  ldloc.0
    IL_0019:  ret
  } // end of method Boolean::Not

} // end of class Boolean
