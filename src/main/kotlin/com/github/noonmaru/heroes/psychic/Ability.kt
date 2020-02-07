/*
 * Copyright (c) 2020 Noonmaru
 *
 * Licensed under the General Public License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/gpl-2.0.php
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.github.noonmaru.heroes.psychic

import com.github.noonmaru.tap.config.Config

class Ability {

    @Config
    var type: Type = Type.PASSIVE

    @Config
    var cooldown: Int = 0

    @Config
    var cost: Int = 0

    @Config
    var castTime: Int = 0

    @Config
    var range: Double = 0.0

    @Config
    var description: List<String> = emptyList()

    enum class Type {
        MOVEMENT,
        CASTING,
        SPELL,
        PASSIVE
    }


}