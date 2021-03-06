/*
 * Copyright (C) 2015 Vinaya Prasad N
 *
 *         This program is free software: you can redistribute it and/or modify
 *         it under the terms of the GNU General Public License as published by
 *         the Free Software Foundation, either version 3 of the License, or
 *         (at your option) any later version.
 *
 *         This program is distributed in the hope that it will be useful,
 *         but WITHOUT ANY WARRANTY; without even the implied warranty of
 *         MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *         GNU General Public License for more details.
 *
 *         You should have received a copy of the GNU General Public License
 *         along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.nvinayshetty.DTOnator.FieldRepresentors;


import com.nvinayshetty.DTOnator.FieldCreator.AccessModifier;

/**
 * Created by vinay on 12/7/15.
 */
public class IntegerFieldRepresentor extends FieldRepresentor {
    @Override
    public String getFieldRepresentationFor(AccessModifier accessModifier, String key) {
        return accessModifier.getModifier() + "int" + suffix(key);
    }

    @Override
    protected String getKotlinValFieldRepresentationFor(AccessModifier accessModifier, String key) {
        return "val " + key + " :Int"+"\n";
    }

    @Override
    protected String getKotlinVarFieldRepresentationFor(AccessModifier accessModifier, String key) {
        return "var " + key + " :Int";
    }


}
