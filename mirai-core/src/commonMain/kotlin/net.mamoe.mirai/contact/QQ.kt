@file:Suppress("EXPERIMENTAL_API_USAGE")

package net.mamoe.mirai.contact

import net.mamoe.mirai.Bot
import net.mamoe.mirai.contact.data.Profile
import net.mamoe.mirai.network.BotSession
import net.mamoe.mirai.network.protocol.tim.packet.action.FriendNameRemark
import net.mamoe.mirai.network.protocol.tim.packet.action.PreviousNameList

/**
 * QQ 对象.
 * 注意: 一个 [QQ] 实例并不是独立的, 它属于一个 [Bot].
 * 它不能被直接构造. 任何时候都应从 [Bot.qq], [Bot.ContactSystem.getQQ], [BotSession.qq] 或事件中获取.
 *
 * 对于同一个 [Bot] 任何一个人的 [QQ] 实例都是单一的.
 *
 * A QQ instance helps you to receive event from or sendPacket event to.
 * Notice that, one QQ instance belong to one [Bot], that is, QQ instances from different [Bot] are NOT the same.
 *
 * @author Him188moe
 */
interface QQ : Contact {
    /**
     * 查询用户资料
     */
    suspend fun queryProfile(): Profile

    /**
     * 查询曾用名.
     *
     * 曾用名可能是:
     * - 昵称
     * - 共同群内的群名片
     */
    suspend fun queryPreviousNameList(): PreviousNameList

    /**
     * 查询机器人账号给这个人设置的备注
     */
    suspend fun queryRemark(): FriendNameRemark
}