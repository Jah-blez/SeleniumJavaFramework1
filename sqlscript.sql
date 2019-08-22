use uat_quickteller

Go

delete FROM [uat_quickteller].[dbo].[PasswordHistory] where Username='fg@th.com'

update [uat_quickteller].[dbo].[aspnet_Membership] set Password ='/L7YRlO31xK6z3VZtvADWN3QO/E=', PasswordSalt='Oi7hjWhTachda2mu28mL3A=='
  				where Email = 'fg@th.com'

update [uat_quickteller].[dbo].[aspnet_Membership] set FailedPasswordAttemptCount ='0', IsLockedOut='0' where Email = 'fg@th.com'


update [uat_quickteller].[dbo].[aspnet_Membership] set FailedPasswordAttemptCount ='0', IsLockedOut='0' where Email = 'abc@test.com'


update [uat_quickteller].[dbo].[aspnet_Membership] set Password ='/L7YRlO31xK6z3VZtvADWN3QO/E=', PasswordSalt='Oi7hjWhTachda2mu28mL3A=='
  				where Email = 'abc@test.com'