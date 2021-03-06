/*
 * This file is part of
 *
 * Copyright (C) 2014-2015 The YLW-Java-Validation-Framework Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ylw.gorm.envers.traits

import grails.compiler.traits.TraitInjector
import org.grails.core.artefact.DomainClassArtefactHandler

/**
 * Created by Yingliang Du
 */
class DomainEnversTraitInjector implements TraitInjector {
    @Override
    Class getTrait() {
        DomainEnversTrait
    }

    @Override
    String[] getArtefactTypes() {
        [DomainClassArtefactHandler.TYPE]
    }

}
