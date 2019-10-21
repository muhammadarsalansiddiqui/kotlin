/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.scopes.impl

import org.jetbrains.kotlin.fir.resolve.FirSymbolProvider
import org.jetbrains.kotlin.fir.scopes.FirPosition
import org.jetbrains.kotlin.fir.scopes.FirScope
import org.jetbrains.kotlin.fir.scopes.ProcessorAction
import org.jetbrains.kotlin.fir.symbols.impl.FirClassifierSymbol
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.Name

class FirNestedClassifierScope(
    val classId: ClassId,
    private val symbolProvider: FirSymbolProvider
) : FirScope() {

    override fun processClassifiersByName(
        name: Name,
        position: FirPosition,
        processor: (FirClassifierSymbol<*>) -> ProcessorAction
    ): ProcessorAction {
        val child = classId.createNestedClassId(name)
        val symbol = symbolProvider.getClassLikeSymbolByFqName(child) ?: return ProcessorAction.NONE

        return processor(symbol)
    }
}
