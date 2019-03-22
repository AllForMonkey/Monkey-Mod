package com.afm.AfmMod.init;

public interface IEntryHolder<T> {

	public Class<? extends T> getEntryType();
	
	public IEntryHolder<T> getInstance();

}