spring security03:异常处理

根据：https://jitwxs.blog.csdn.net/article/details/80250389

异常处理


UsernameNotFoundException（用户不存在）
DisabledException（用户已被禁用）
BadCredentialsException（坏的凭据）
LockedException（账户锁定）
AccountExpiredException （账户过期）
CredentialsExpiredException（证书过期）

以上列出的这些异常都是 AuthenticationException 的子类，然后我们来看看 Spring security 如何处理 AuthenticationException 异常的。