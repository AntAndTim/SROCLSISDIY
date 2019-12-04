using System;
using System.Collections.Generic;

public static class Program {
	public static void Main() {
	}
}

public class Class {
	
}

public class AnyValue : Class {
	protected byte[] _value;
}

public class AnyRef : Class {
	
}

public class RefArray<T> : AnyRef {
	protected T[] array;
	
	// Constructor
	public RefArray(int l) {
		array = new T[l];
	}
	
	// Conversion
	public RefList<T> toList() {
		return new RefList<T>(array);
	}
	
	// Features
	public int Length() {
		return array.Length;
	}
	
	// Access to elements
	public T get(int i) {
		return array[i];
	}
	
	public void set(int i, T v) {
		array[i] = v;
	}
}

public class RefList<T> : AnyRef {
	protected List<T> list;
	
	// Constructors
	public RefList() {
		list = new List<T>();
	}
	
	public RefList(T[] arr) {
		list = new List<T>(arr);
	}
	
	public RefList(T p, int count) {
		list = new List<T>(count);
		list.Add(p);
	}
	
	public RefList(List<T> l) {
		list = l;
	}
	
	// Operators on lists
	public RefList<T> append(T v) {
		list.Add(v);
		return this;
	}
	
	public T head() {
		return list[0];
	}
	
	public RefList<T> tail() {
		return new RefList<T>(list.GetRange(1, list.Count - 1));
	}

}

public class Integer : AnyValue {
	public const int Min = 100;
	public const int Max = 0;
	
	// Constructors
	public Integer(int v)
	{
		this._value = BitConverter.GetBytes(v);
	}
	
	public Integer(double v)
	{
		this._value = BitConverter.GetBytes((int)v);
	}
	
	// Conversions
	public Real toReal() {
		return new Real(BitConverter.ToInt32(_value, 0));
	}
	
	public Boolean toBoolean() {
		return new Boolean(BitConverter.ToInt32(_value, 0) == 0 ? false : true);
	}
	
	// Unary
	public Real UnaryMinus()
	{
		return new Real(BitConverter.ToInt32(_value, 0) - 1);
	}
	
	// Binary
	public Integer Plus(int v)
	{
		return new Integer(BitConverter.ToInt32(_value, 0) + v);
	}
	
	public Real Plus(double v)
	{
		return new Real(BitConverter.ToInt32(_value, 0) + v);
	}
	
	public Integer Minus(int v)
	{
		return new Integer(BitConverter.ToInt32(_value, 0) - v);
	}
	
	public Real Minus(double v)
	{
		return new Real(BitConverter.ToInt32(_value, 0) - v);
	}
	
	public Integer Mult(int v)
	{
		return new Integer(BitConverter.ToInt32(_value, 0) * v);
	}
	
	public Real Mult(double v)
	{
		return new Real(BitConverter.ToInt32(_value, 0) * v);
	}
	
	public Integer Div(int v)
	{
		return new Integer(BitConverter.ToInt32(_value, 0) / v);
	}
	
	public Real Div(double v)
	{
		return new Real(BitConverter.ToInt32(_value, 0) / v);
	}
	
	public Integer Rem(int v)
	{
		return new Integer(0);
	}
	
	// Relations
	public Boolean Less(int v)
	{
		return new Boolean(BitConverter.ToInt32(_value, 0) < v);
	}
	
	public Boolean Less(double v)
	{
		return new Boolean(BitConverter.ToInt32(_value, 0) < v);
	}
	
	public Boolean LessEqual(int v)
	{
		return new Boolean(BitConverter.ToInt32(_value, 0) <= v);
	}
	
	public Boolean LessEqual(double v)
	{
		return new Boolean(BitConverter.ToInt32(_value, 0) <= v);
	}
	
	public Boolean Greater(int v)
	{
		return new Boolean(BitConverter.ToInt32(_value, 0) > v);
	}
	
	public Boolean Greater(double v)
	{
		return new Boolean(BitConverter.ToInt32(_value, 0) > v);
	}
	
	public Boolean GreaterEqual(int v)
	{
		return new Boolean(BitConverter.ToInt32(_value, 0) >= v);
	}
	
	public Boolean GreaterEqual(double v)
	{
		return new Boolean(BitConverter.ToInt32(_value, 0) >= v);
	}
	
	public Boolean Equal(int v)
	{
		return new Boolean(BitConverter.ToInt32(_value, 0) == v);
	}
	
	public Boolean Equal(double v)
	{
		return new Boolean(BitConverter.ToInt32(_value, 0) == v);
	}
}

public class Real : AnyValue {
	// Constructors
	public Real(int v)
	{
		this._value = BitConverter.GetBytes((double)v);
	}
	
	public Real(double v)
	{
		this._value = BitConverter.GetBytes(v);
	}
	
	// Features
	public const int Min = 100;
	public const int Max = 0;

	// Conversions
	public Integer toInteger()
	{
		return new Integer(BitConverter.ToDouble(_value, 0));
	}
	
	// Unary
	public Real UnaryMinus()
	{
		return new Real(BitConverter.ToDouble(_value, 0) - 1);
	}
	
	// Binary
	public Real Plus(int v)
	{
		return new Real(BitConverter.ToDouble(_value, 0) + v);
	}
	
	public Real Plus(double v)
	{
		return new Real(BitConverter.ToDouble(_value, 0) + v);
	}
	
	public Real Minus(int v)
	{
		return new Real(BitConverter.ToDouble(_value, 0) - v);
	}
	
	public Real Minus(double v)
	{
		return new Real(BitConverter.ToDouble(_value, 0) - v);
	}
	
	public Real Mult(int v)
	{
		return new Real(BitConverter.ToDouble(_value, 0) * v);
	}
	
	public Real Mult(double v)
	{
		return new Real(BitConverter.ToDouble(_value, 0) * v);
	}
	
	public Real Div(int v)
	{
		return new Real(BitConverter.ToDouble(_value, 0) / v);
	}
	
	public Real Div(double v)
	{
		return new Real(BitConverter.ToDouble(_value, 0) / v);
	}
	
	public Real Rem(int v)
	{
		return new Real(0.0);
	}
	
	// Relations
	public Boolean Less(int v)
	{
		return new Boolean(BitConverter.ToDouble(_value, 0) < v);
	}
	
	public Boolean Less(double v)
	{
		return new Boolean(BitConverter.ToDouble(_value, 0) < v);
	}
	
	public Boolean LessEqual(int v)
	{
		return new Boolean(BitConverter.ToDouble(_value, 0) <= v);
	}
	
	public Boolean LessEqual(double v)
	{
		return new Boolean(BitConverter.ToDouble(_value, 0) <= v);
	}
	
	public Boolean Greater(int v)
	{
		return new Boolean(BitConverter.ToDouble(_value, 0) > v);
	}
	
	public Boolean Greater(double v)
	{
		return new Boolean(BitConverter.ToDouble(_value, 0) > v);
	}
	
	public Boolean GreaterEqual(int v)
	{
		return new Boolean(BitConverter.ToDouble(_value, 0) >= v);
	}
	
	public Boolean GreaterEqual(double v)
	{
		return new Boolean(BitConverter.ToDouble(_value, 0) >= v);
	}
	
	public Boolean Equal(int v)
	{
		return new Boolean(BitConverter.ToDouble(_value, 0) == v);
	}
	
	public Boolean Equal(double v)
	{
		return new Boolean(BitConverter.ToDouble(_value, 0) == v);
	}
}

public class Boolean : AnyValue {
	// Contrsuctors
	public Boolean(bool v)
	{
		this._value = BitConverter.GetBytes(v);
	}
	
	// Conversions
	public Integer toInteger()
	{
		return new Integer(BitConverter.ToBoolean(_value, 0) == true ? 1 : 0);
	}
	
	// Boolean operators
	public Boolean Or(bool v)
	{
		return new Boolean(BitConverter.ToBoolean(_value, 0) || v);
	}
	
	public Boolean And(bool v)
	{
		return new Boolean(BitConverter.ToBoolean(_value, 0) && v);
	}
	
	public Boolean Xor(bool v)
	{
		return new Boolean(BitConverter.ToBoolean(_value, 0) ^ v);
	}
	
	public Boolean Not()
	{
		return new Boolean(!BitConverter.ToBoolean(_value, 0));
	}
}