/*
 * 
 * Copyright (c) 2010 Tom Parker <thpr@users.sourceforge.net>
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA
 */
package selectionactor.auto;

import org.junit.Test;

import pcgen.cdom.base.ChooseSelectionActor;
import pcgen.core.WeaponProf;
import plugin.lsttokens.auto.WeaponProfToken;
import selectionactor.testsupport.AbstractSelectionActorTest;

public class WeaponProfTokenTest extends AbstractSelectionActorTest<WeaponProf>
{

	static WeaponProfToken cra = new WeaponProfToken();

	@Test
	public void testEmpty()
	{
		// Just to get Eclipse to recognize this as a JUnit 4.0 Test Case
	}

	@Override
	public ChooseSelectionActor<WeaponProf> getActor()
	{
		return cra;
	}

	@Override
	public Class<WeaponProf> getCDOMClass()
	{
		return WeaponProf.class;
	}

	@Override
	public boolean isGranted()
	{
		return false;
	}
}